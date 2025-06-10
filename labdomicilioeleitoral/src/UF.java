import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Representa uma Unidade da Federação.
 *  - nome : String
 *  - sigla: String
 *  - 1 UF possui 0..* Municípios
 */
public class UF {
    private String nome;
    private String sigla;

    // Mantemos um mapa de municípios, indexado pelo nome (poderia ser List também, mas Map ajuda a evitar duplicidade)
    private Map<String, Municipio> municipios = new LinkedHashMap<>();

    /**
     * Construtor de UF.
     * @param nome  nome completo da UF (por ex: "Espírito Santo")
     * @param sigla sigla da UF (por ex: "ES")
     */
    public UF(String nome, String sigla) {
        if (nome == null || sigla == null) {
            throw new IllegalArgumentException("Nome e sigla não podem ser nulos.");
        }
        this.nome = nome;
        this.sigla = sigla;
    }

    /**
     * Cria um novo Município dentro desta UF e já retorna o objeto criado.
     * Também faz o vínculo unidirecional (UF -> Município).
     * @param nomeMunicipio nome do novo município
     * @return objeto Município recém-criado, que já está “vinculado” a esta UF
     */
    public Municipio criarMunicipio(String nomeMunicipio) {
        if (nomeMunicipio == null || nomeMunicipio.isEmpty()) {
            throw new IllegalArgumentException("Nome do município não pode ser vazio.");
        }
        if (municipios.containsKey(nomeMunicipio)) {
            // Se já existe município com esse nome, apenas retorna o existente (ou você pode gerar erro).
            return municipios.get(nomeMunicipio);
        }
        Municipio m = new Municipio(nomeMunicipio, this);
        municipios.put(nomeMunicipio, m);
        return m;
    }

    /**
     * Retorna todos os municípios pertencentes a esta UF (útil para iteração no DotExporter).
     */
    public Collection<Municipio> getMunicipios() {
        return municipios.values();
    }

    /** Getters simples */
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return "UF[" + sigla + " - " + nome + "]";
    }
}
