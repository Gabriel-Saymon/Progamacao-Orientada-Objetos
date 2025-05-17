public class Empresa {

    private String nome;
    private java.util.HashSet<Departamento> departamentos;

    public Empresa (String nome){
        this.nome = nome;
        this.departamentos = new java.util.HashSet<>();
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
    
    public void printaDepartamentos() {
        int i = 1;
        for (Departamento departamento : departamentos) {
            System.out.println(i + " - " + departamento.getName());
            i++;
        }
    }

    public void printaTudo(){
        int i = 1;
        for (Departamento departamento : departamentos) {
            System.out.println(i + " - " + departamento.getName());
            departamento.printaPessoasDepartamento();
            i++;
        }
    }

}
