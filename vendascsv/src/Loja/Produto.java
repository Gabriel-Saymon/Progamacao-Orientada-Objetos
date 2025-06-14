package Loja;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Produto {
    private int id;
    private String name;
    private double price;
    private Set<Venda> vendasProduto = new HashSet<>();
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public Produto (int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void addVenda(Venda venda){
        this.vendasProduto.add(venda);
    }

    public Collection<Venda> getVendas(){
        return new HashSet<>(this.vendasProduto);
    }

    
}
