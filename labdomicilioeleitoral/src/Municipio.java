import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Representa um Município.
 *  - nome : String
 *  - 1 Município pertence a exatamente 1 UF
 *  - 1 Município possui 0..* Pessoas (eleitores)
 */
public class Municipio {
    private String nome;
    private UF uf;

    /**
     * Mapa interno de eleitores: chave é o CPF (único) e valor é o objeto Pessoa.
     * Usamos LinkedHashMap para manter a ordem de inserção (opcional).
     */
    private Map<String, Pessoa> eleitores = new LinkedHashMap<>();

    /**
     * Construtor de Município.
     * Note que, na prática, nós só chamamos este construtor via UF.criarMunicipio(...),
     * por isso aqui não “registramos” este município em uf.municipios novamente (já foi feito no criarMunicipio).
     *
     * @param nome nome do município
     * @param uf   referência à UF a que este município pertence
     */
    public Municipio(String nome, UF uf) {
        if (nome == null || uf == null) {
            throw new IllegalArgumentException("Nome do município e UF não podem ser nulos.");
        }
        this.nome = nome;
        this.uf = uf;
    }

    /**
     * Retorna o nome do município.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a UF a que este município pertence.
     */
    public UF getUF() {
        return uf;
    }

    /**
     * Método usado INTERNAMENTE para adicionar um eleitor ao mapa, sem disparar novamente o setDomicilioEleitoral.
     * Chamado sempre que uma Pessoa for “vinculada” a este município.
     * @param p objeto Pessoa a ser adicionado
     */
    void adicionaEleitorDireto(Pessoa p) {
        eleitores.put(p.getCpf(), p);
    }

    /**
     * Método usado INTERNAMENTE para remover um eleitor do mapa, sem tocar no objeto Pessoa.
     * @param p objeto Pessoa a ser removido
     */
    void removeEleitorDireto(Pessoa p) {
        eleitores.remove(p.getCpf());
    }

    /**
     * Método público para “incluir” um eleitor neste município.
     * Internamente, chama p.setDomicilioEleitoral(this), que já cuida de remover o eleitor
     * do município antigo (se houver) e adicioná-lo aqui.
     *
     * @param p objeto Pessoa que terá seu domicílio eleitoral alterado para este município
     */
    public void adicionaEleitor(Pessoa p) {
        if (p == null) {
            throw new IllegalArgumentException("Pessoa não pode ser nula.");
        }
        p.setDomicilioEleitoral(this);
    }

    /**
     * Retorna um Map (imutável) com todos os eleitores deste município.
     * O DotExporter itera sobre m.getEleitores().values().
     */
    public Map<String, Pessoa> getEleitores() {
        // Retornamos uma view imutável, para não deixar código externo alterar diretamente o mapa.
        return Collections.unmodifiableMap(eleitores);
    }

    @Override
    public String toString() {
        return "Municipio[" + nome + " - " + uf.getSigla() + "]";
    }
}

