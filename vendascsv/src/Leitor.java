import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import Loja.Loja;

public class Leitor {

    public static Loja carregarDados(String produtosPath, String vendasPath) throws IOException {
        Loja loja = new Loja();

        //leitura dos produtos
        try (BufferedReader br = Files.newBufferedReader(Paths.get(produtosPath), StandardCharsets.UTF_8)) {
            String linha = br.readLine(); // pula cabeçalho
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(",");
                int id    = Integer.parseInt(colunas[0]);
                String nome  = colunas[1];
                double preco = Double.parseDouble(colunas[2]);
                loja.criaProduto(id, nome, preco);
            }
        }

        //leitura das vendas
        try (BufferedReader br = Files.newBufferedReader(Paths.get(vendasPath), StandardCharsets.UTF_8)) {
            String linha = br.readLine(); // pula cabeçalho
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(",");
                int idVenda    = Integer.parseInt(colunas[0]);
                int idProduto  = Integer.parseInt(colunas[1]);
                int quantidade = Integer.parseInt(colunas[2]);
                loja.criaVenda(idVenda, quantidade, idProduto);
            }
        }

        return loja;
    }
}
