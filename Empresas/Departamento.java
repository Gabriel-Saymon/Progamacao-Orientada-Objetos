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
    
}
