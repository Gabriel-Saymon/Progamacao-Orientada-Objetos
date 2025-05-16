public class Empresa {

    private String nome;
    private java.util.HashSet<Departamento> departamentos;

    public Empresa (String nome){
        this.nome = nome;
    }

    public String getName(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    
}