
# Exercícios de Programação em Java

Este repositório contém dois exercícios de prática com Java, organizados em diretórios separados.

## 📁 E1 - Triângulo no Plano Cartesiano

Este exercício consiste em:

- Uma classe `Ponto` que representa um ponto no plano cartesiano.
- Uma classe `Triangulo` que representa um triângulo formado por três pontos.
- Um programa principal `Main` que recebe 6 números em ponto flutuante pela linha de comando (String args[]) representando as coordenadas dos vértices do triângulo e imprime o perímetro do triângulo.

### Como compilar e executar

```bash
javac *.java
java Main 0 0 3 0 0 4
```

## 📁 E2 - Loja com Produtos

Este exercício consiste em:

- Uma hierarquia de classes para uma loja que vende livros e jogos de tabuleiro.
- Uma superclasse `Produto` com nome e preço.
- Subclasses `Livro` (com autor) e `JogoTabuleiro` (com idade mínima recomendada).
- Método `toString()` sobrescrito para fornecer descrições específicas.
- Um programa `App` que cria 5 produtos diferentes e imprime suas descrições.

### Como compilar e executar

```bash
javac *.java
java App
```