import java.time.LocalDate;

public class App{
    public static void main(String[] args){

        /*
         * Criando a Empresa e o departamento. 
        */
        Empresa empresa = new Empresa("WebDreams");
        Departamento desenvolvimento = new Departamento("Developers");
        Departamento marketing = new Departamento("Marketing");
        Departamento financeiro = new Departamento("Financas");

        empresa.addDepartamento(desenvolvimento);
        empresa.addDepartamento(marketing);
        empresa.addDepartamento(financeiro);

        /*
         * Criacao de pessoas.
        */
        LocalDate data = LocalDate.of(2001,12,17);
        Pessoa person = new Pessoa("Gabriel", data);

        LocalDate dataLeandro = LocalDate.of(2001,04,06);
        Pessoa person2 = new Pessoa("Leandro", dataLeandro);

        LocalDate dataRafaela = LocalDate.of(2002,06,29);
        Pessoa person3 = new Pessoa("Rafaela", dataRafaela);

        LocalDate dataRhai = LocalDate.of(1999,10,03);
        Pessoa person4 = new Pessoa("Rhaiza", dataRhai);

        LocalDate dataWanderson = LocalDate.of(1985,8,03);
        Pessoa person5 = new Pessoa("Wanderson", dataWanderson);

        LocalDate dataGrazianne = LocalDate.of(1987,04,13);
        Pessoa person6 = new Pessoa("Grazianne", dataGrazianne);
        
        /*
         * Adicionando Funcionarios.
        */
        desenvolvimento.addFuncionarios(person);
        desenvolvimento.addFuncionarios(person2);
        desenvolvimento.addFuncionarios(person3);
        marketing.addFuncionarios(person4);
        financeiro.addFuncionarios(person5);
        financeiro.addFuncionarios(person6);


        /*
         * Prints de teste.
        */

        System.out.println("\n\t\t\t" + "*** " + empresa.getName() + " ***\n");
        empresa.Relatorio();
    
    }
}