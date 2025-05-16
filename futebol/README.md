# Histórico de uma Partida de Futebol

Guarda informações sobre uma partida de futebol simples entre dois times, onde é possível registrar **gols** e **faltas**, e calcular o placar com base nos eventos ocorridos durante o jogo.

## 📁 Estrutura do Projeto

```
futebol/
├── Time.java      # Representa um time de futebol
├── Lance.java     # Classe abstrata para representar eventos da partida
├── Gol.java       # Representa um gol (herda Lance)
├── Falta.java     # Representa uma falta (herda Lance)
├── Partida.java   # Gerencia os times e os lances da partida
├── Main.java      # Classe principal
```

## Como Executar

1. Compile todos os arquivos `.java`:

```bash
javac *.java
```

2. Execute o programa:

```bash
java Main
```

## Funcionalidades

- Criação de dois times.
- Registro de lances (gols e faltas).
- Cálculo do placar da partida com base nos lances.
- Exibição do resultado no console.

## Padrões de Projeto

O projeto utiliza princípios como:

- **Herança**: `Gol` e `Falta` herdam da classe abstrata `Lance`.
- **Encapsulamento**: Cada classe possui seus próprios atributos e métodos de acesso.

