package Loja;

import java.util.HashMap;
import java.util.Map;

public class Loja {
    private String name;
    private Map<Integer,Produto> produtos = new HashMap<>();
    private Map<Integer,Venda> vendas = new HashMap<>();

    public String getName() {
        return name;
    }

    public Produto criaProduto(int id, String name, double price){
        Produto produto = new Produto(id, name, price);
        produtos.put(id,produto);
        return produto;
    }
    
    public Venda criaVenda(int idVenda, int quantidade, int idProduto){
        Produto p = produtos.get(idProduto);
        Venda venda = new Venda(idVenda, quantidade, p);
        vendas.put(idVenda, venda);
        return venda;
    }
}
