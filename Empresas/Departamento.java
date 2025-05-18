public class Departamento {
    
    private String nome;
    private java.util.HashSet<Pessoa> funcionarios;

    public Departamento (String nome){
        this.nome = nome;
        this.funcionarios = new java.util.HashSet<>();
    }

    public String getName(){
        return this.nome;
    }

    public void addFuncionarios (Pessoa funcionario){
        this.funcionarios.add(funcionario);
    }

    public void printaPessoasDepartamento() {
        int i = 1;
        for (Pessoa pessoa : funcionarios) {
            System.out.println("\t" + i + " - " + pessoa.getName() + " - " + pessoa.getIdade() + " anos.");
            i++;
        }
    }

    public float getMedia(){
        float media = 0;
        int i = 1;

        for (Pessoa pessoa : funcionarios) {
            media += pessoa.getIdade();
            i++;
        }

        if(i-1 == 0) return media;
            return media/(i-1);
    }

    public int getFuncionarios() {
        return funcionarios.size();
    }

    public float getAllIdades(){
        float soma = 0;

        for (Pessoa pessoa : funcionarios) {
            soma += pessoa.getIdade();
            
        }
        return soma;
    }
}
