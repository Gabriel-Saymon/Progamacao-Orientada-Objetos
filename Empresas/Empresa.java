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

    public void Relatorio(){
        int i = 1;
        int quantidade_de_funcionarios = 0;
        float media_total = 0;
        for (Departamento departamento : departamentos) {
            System.out.println("# " + i + " - " + departamento.getName() + ":");
            departamento.printaPessoasDepartamento();
            i++;

            quantidade_de_funcionarios += departamento.getFuncionarios();
            media_total += departamento.getAllIdades();

            System.out.printf("\n- Média de idade do setor %s: %.0f anos.\n\n", departamento.getName(), departamento.getMedia());
        }

        if(quantidade_de_funcionarios == 0) System.out.printf("\t\t*** Média de idade da empresa: %.0f anos. ***", media_total);
            System.out.printf("\t\t*** Média de idade da empresa: %.2f anos. ***\n", media_total/(quantidade_de_funcionarios-1));

    }

}
