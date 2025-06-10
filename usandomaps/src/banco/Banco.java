// src/banco/Banco.java
package banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private String nome;
    private Map<String,Agencia> agencias = new HashMap<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agencia criaAgencia(String nome) {
        if (agencias.containsKey(nome)) {
            return null;  // já existe
        }
        Agencia a = new Agencia(nome);
        agencias.put(nome, a);
        return a;
    }

    // Etapa 1: obter agência
    public Agencia obtemAgencia(String nome) {
        return agencias.get(nome);
    }

    // Etapa 1: remover agência
    public boolean removeAgencia(String nome) {
        return agencias.remove(nome) != null;
    }
}
