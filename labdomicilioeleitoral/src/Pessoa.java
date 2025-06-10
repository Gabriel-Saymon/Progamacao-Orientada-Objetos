/**
 * Representa uma Pessoa (Eleitor).
 *  - nome : String
 *  - cpf  : String   (número único de identificação)
 *  - domicilioEleitoral : Município (exatamente 1)
 *
 * Ao mudar o domicílio eleitoral, o próprio setter trata de:
 *  - remover o eleitor do município antigo, se já estivesse cadastrado
 *  - adicionar o eleitor no novo município
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Municipio domicilioEleitoral;

    /**
     * Construtor de Pessoa.
     * @param nome      nome da pessoa
     * @param cpf       CPF (único) da pessoa
     * @param domicilio município onde a pessoa já nasce como eleitor
     */
    public Pessoa(String nome, String cpf, Municipio domicilio) {
        if (nome == null || cpf == null || domicilio == null) {
            throw new IllegalArgumentException("Nome, CPF e município não podem ser nulos.");
        }
        this.nome = nome;
        this.cpf = cpf;
        // Inicialmente, não atribuímos nada a domicilioEleitoral, para usar a lógica do setter:
        this.domicilioEleitoral = null;
        // Chama o setter para acertar todos os vínculos
        setDomicilioEleitoral(domicilio);
    }

    /**
     * Retorna o nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Retorna o município que é o domicílio eleitoral desta pessoa.
     */
    public Municipio getDomicilioEleitoral() {
        return domicilioEleitoral;
    }

    /**
     * Altera o domicílio eleitoral desta pessoa para um novo município.
     * Se ela já pertencia a outro município, remove do antigo.
     * Em seguida, adiciona no novo município (chamando o método interno dele).
     *
     * @param novoMunicipio município para onde o eleitor está se transferindo
     */
    public void setDomicilioEleitoral(Municipio novoMunicipio) {
        if (novoMunicipio == null) {
            throw new IllegalArgumentException("Município não pode ser nulo.");
        }
        // Se já estiver no mesmo município, não faz nada
        if (novoMunicipio.equals(this.domicilioEleitoral)) {
            return;
        }

        // 1) Se já tinha um município anterior, remove deste
        if (this.domicilioEleitoral != null) {
            this.domicilioEleitoral.removeEleitorDireto(this);
        }

        // 2) Atualiza o campo interno
        this.domicilioEleitoral = novoMunicipio;

        // 3) Adiciona “diretamente” este objeto Pessoa no mapa de eleitores do novo município
        this.domicilioEleitoral.adicionaEleitorDireto(this);
    }

    @Override
    public String toString() {
        return "Pessoa[" + nome + " - CPF: " + cpf + "]";
    }
}

