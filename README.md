# Programacao-Orientada-Objetos

Este diretório é voltado ao estudo e desenvolvimento de atividades práticas realizadas durante o curso de **Programação Orientada a Objetos** utilizando a linguagem **Java**.

## 📁 **Empresas (1º exercício)** :

O projeto simula uma estrutura organizacional com empresas, departamentos e funcionários, permitindo calcular e exibir informações como a média de idade dos colaboradores.

### 🔹 App.java

Arquivo principal que executa o programa. Ele:

- Cria uma instância da empresa `WebDreams`;
- Cria departamentos (Desenvolvimento, Marketing, Finanças);
- Cadastra pessoas (funcionários) com suas respectivas datas de nascimento;
- Adiciona os funcionários aos departamentos;
- Gera um relatório completo da empresa com todos os departamentos, seus funcionários e estatísticas.

### 🔹 Empresa.java

Classe que representa uma empresa. Responsável por:

- Armazenar um conjunto de departamentos;
- Adicionar novos departamentos;
- Exibir os departamentos registrados;
- Gerar um relatório geral da empresa com todas as informações de cada departamento e média de idade dos funcionários.

### 🔹 Departamento.java

Classe que representa um departamento dentro da empresa. Suas responsabilidades incluem:

- Armazenar os funcionários do setor;
- Adicionar novos funcionários;
- Imprimir todos os funcionários do departamento;
- Calcular a média de idade dos funcionários;
- Retornar a quantidade total de funcionários e a soma de todas as idades do setor.

### 🔹 Pessoa.java

Classe que representa uma pessoa/funcionário. Armazena:

- Nome do funcionário;
- Data de nascimento;
- Cálculo da idade com base na data atual.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- `java.time.LocalDate` para manipulação de datas
- `HashSet` para armazenar listas sem duplicações

## ▶️ Como Executar

1. Compile os arquivos:

```bash
javac App.java Departamento.java Empresa.java Pessoa.java
java App
