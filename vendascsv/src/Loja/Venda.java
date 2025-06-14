package Loja;

public class Venda {
    private int idVenda;
    private int quantidade;
    private Produto produtoVendido;

    public int getIdVenda() {
        return idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produtoVendido;
    }

    public Venda (int idVenda, int quantidade, Produto p){
        this.idVenda = idVenda;
        this.quantidade = quantidade;
        this.produtoVendido = p;
    }

}
