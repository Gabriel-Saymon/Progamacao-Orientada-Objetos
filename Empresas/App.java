import java.time.LocalDate;

public class App{
    public static void main(String[] args){

        /*
         * Criando a Empresa e o departamento. 
        */
        Empresa empresa = new Empresa("WebDreams");
        Departamento desenvolvimento = new Departamento("developers");
        Departamento marketing = new Departamento("marketing");

        empresa.addDepartamento(desenvolvimento);
        empresa.addDepartamento(marketing);

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

        /*
         * Adicionando Funcionarios.
        */
        desenvolvimento.addFuncionarios(person);
        desenvolvimento.addFuncionarios(person2);
        desenvolvimento.addFuncionarios(person3);
        marketing.addFuncionarios(person4);

        /*
         * Prints de teste.
        */

        System.out.println("\n\t\t" + "-- " + empresa.getName() + " --");
        empresa.printaTudo();
    
    }
}