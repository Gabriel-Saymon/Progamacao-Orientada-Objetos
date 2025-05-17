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
    
    public float mediaFuncionarios(){
        float soma = 0, media = 0;
        int qtd = 0;

        for(Pessoa pessoa : funcionarios){
            soma += pessoa.getIdade();
            qtd++;
        }
        media = soma/qtd;
        return media;
    }

    public void printaPessoasDepartamento(){
        int i = 1;
        for(Pessoa pessoa : funcionarios){
            System.out.println("\t" + i + "-" +pessoa.getName() +".");
            i++;
        }
    }
}
