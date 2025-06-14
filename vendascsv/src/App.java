import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;

import Loja.Loja;
import Loja.Produto;
import Loja.Venda;


public class App {
    public static void main(String[] args) {
         try {
            Loja loja = Leitor.carregarDados("produtos.csv", "vendas.csv");
            double totalGeral = 0;

            Collection<Venda> vendas = loja.getVendas();
            for (Venda venda : vendas) {
                int idVenda = venda.getIdVenda();
                int quantidade = venda.getQuantidade();
                String nomeProduto = venda.getProduto().getName();
                double precoUnitario = venda.getProduto().getPrice();
                double totalVenda = quantidade * precoUnitario;

                totalGeral += totalVenda;

                System.out.printf(
                    "Venda %d: %dx %s - Total: R$ %.2f%n",
                    idVenda,
                    quantidade,
                    nomeProduto,
                    totalVenda
                );
            }

            // Exibe total geral com String.format()
            String resumo = String.format("Total geral: R$ %.2f", totalGeral);
            System.out.println(resumo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}