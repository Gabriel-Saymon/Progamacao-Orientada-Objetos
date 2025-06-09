
public class JogoTabuleiro extends Produto {
    private int idadeMinima;

    public JogoTabuleiro(String nome, double preco, int idadeMinima) {
        super(nome, preco);
        this.idadeMinima = idadeMinima;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade mínima: " + idadeMinima + " anos";
    }
}
