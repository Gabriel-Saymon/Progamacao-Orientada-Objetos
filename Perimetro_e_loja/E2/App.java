
public class App {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("O Senhor dos Anéis", 59.90, "J.R.R. Tolkien");
        produtos[1] = new Livro("Dom Casmurro", 39.90, "Machado de Assis");
        produtos[2] = new JogoTabuleiro("War", 79.90, 10);
        produtos[3] = new JogoTabuleiro("Banco Imobiliário", 69.90, 8);
        produtos[4] = new Livro("1984", 45.50, "George Orwell");

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
