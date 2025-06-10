# Projeto Banco

Este projeto implementa um sistema bancário simples em Java. Ele inclui classes para representar um banco, agência e conta de clientes, além de uma aplicação de console para interação.

## Estrutura do Projeto

```
.
├── src
│   ├── banco
│   │   ├── Conta.java      # Define a classe Conta (cliente e saldo)
│   │   ├── Agencia.java    # Define a classe Agencia (gerencia contas)
│   │   └── Banco.java      # Define a classe Banco (gerencia agências)
│   └── App.java            # Aplicação principal com menu de operações
└── README.md               # Documento de apresentação e instruções
```

## Funcionalidades

- Criar conta para um cliente, com saldo inicial
- Consultar saldo de uma conta existente
- Excluir conta de um cliente
- Listar todas as contas de uma agência

## Como Compilar e Executar

1. **Compile**:
   ```bash
   javac -d lib src/banco/*.java src/App.java
   ```

2. **Execute**:
   ```bash
   java -cp src App
   ```