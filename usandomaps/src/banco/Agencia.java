package banco;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class Agencia {
    private String nome;
    private Map<String,Conta> contas = new HashMap<>();

    public Agencia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Etapa 1: criar conta (adicionaConta)
    public Conta adicionaConta(String nomeCliente, double saldoInicial) {
        if (contas.containsKey(nomeCliente)) {
            return null;  // já existe
        }
        Conta c = new Conta(nomeCliente, saldoInicial);
        contas.put(nomeCliente, c);
        return c;
    }

    // Etapa 1: obter conta
    public Conta obtemConta(String nomeCliente) {
        return contas.get(nomeCliente);
    }

    // Etapa 1: remover conta
    public boolean removeConta(String nomeCliente) {
        return contas.remove(nomeCliente) != null;
    }

    // Etapa 2: listar todas as contas
    public Collection<Conta> getTodasContas() {
        return contas.values();
    }
}

