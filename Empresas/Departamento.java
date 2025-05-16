public class Departamento {
    
    private String nome;
    private java.util.HashSet<Pessoa> funcionarios;

    public Departamento (String nome){
        this.nome = nome;
    }

    public String getName(){
        return this.nome;
    }

    public void addFuncionarios (Pessoa funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public float mediaFuncionarios(){
        float soma = 0.0, media = 0.0;
        int qtd = 0;

        for(Pessoa pessoa : funcionarios){
            soma += pessoa.getIdade();
            qtd++;
        }
        media = soma/qtd;
        return media;
    }
}
