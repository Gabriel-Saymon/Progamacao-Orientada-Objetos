import java.time.LocalDate

public class Pessoa {

    private String nome;
    private LocalDate aniversario;

    public Pessoa(String nome, LocalDate dataDeNascimento){
        this.nome = nome;
        this.aniversario = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento(){
        return this.aniversario;
    }

    public String getName(){
        return this.nome;
    }

    public int getIdade(){
        int anoAtual = LocalDate.now().getYear();
        int diaAtual = LocalDate.now().getDayOfYear();

        int anoNascimento = this.aniversario.getYear();
        int diaNascimento = this.aniversario.getDayOfYear();


        if(diaAtual >= diaNascimento)
            return anoAtual - anoNascimento;
        else
            return anoAtual - anoNascimento - 1;

    }

}
