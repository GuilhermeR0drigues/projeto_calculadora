# Projeto-Calculadora

Calculadora em Java com operações matemáticas básicas, testes unitários automatizados com JUnit 5 e documentação gerada com JavaDoc.

**Autor:** Guilherme Rodrigues Pereira de Oliveira

---

## 📌 Descrição do projeto

O projeto implementa a classe `Calculadora`, que recebe dois números inteiros e um operador (`+`, `-`, `*` ou `/`) e devolve uma mensagem com o resultado da operação. Entradas inválidas, como operador desconhecido, operador nulo e divisão por zero, são tratadas e retornam mensagens de erro claras, sem lançar exceções.

A classe `App` serve como ponto de entrada para executar a calculadora pelo terminal, e a classe `TesteCalculadora` contém os testes unitários que validam cada comportamento.

## 🎯 Objetivo da atividade

Praticar o ciclo de desenvolvimento de um pequeno projeto Java, abordando:

- organização de código em pacotes;
- implementação de regras de negócio com tratamento de casos de erro;
- criação de testes unitários com JUnit 5;
- documentação do código com comentários JavaDoc e geração da documentação em HTML;
- versionamento e entrega do projeto em um repositório.

## 🛠️ Tecnologias utilizadas

| Tecnologia | Uso |
|---|---|
| Java | Linguagem de programação |
| JUnit 5 (Jupiter) | Testes unitários |
| JUnit Platform Console Standalone 1.14.4 | Execução dos testes |
| JavaDoc | Geração da documentação |
| Visual Studio Code + Extension Pack for Java | Ambiente de desenvolvimento |
| Git / GitHub | Controle de versão |

## 📁 Estrutura do projeto

```
Projeto-Calculadora/
├── .vscode/
│   └── settings.json
├── bin/                         # Arquivos compilados
├── lib/
│   └── junit-platform-console-standalone-1.14.4.jar
├── src/
│   ├── App.java
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
└── README.md
```

O arquivo `.vscode/settings.json` define as pastas do projeto:

```json
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```

## ➕ Explicação das operações

O método principal é `String calc(int a, int b, String op)`, onde `a` e `b` são os números e `op` é o operador.

| Operador | Operação | Exemplo | Retorno |
|---|---|---|---|
| `+` | Soma | `calc(10, 5, "+")` | `O resultado é: 15` |
| `-` | Subtração | `calc(10, 5, "-")` | `O resultado é: 5` |
| `*` | Multiplicação | `calc(10, 5, "*")` | `O resultado é: 50` |
| `/` | Divisão inteira | `calc(10, 5, "/")` | `O resultado é: 2` |

### Tratamento de erros

| Situação | Exemplo | Retorno |
|---|---|---|
| Divisão por zero | `calc(10, 0, "/")` | `Não é possível divisão por 0` |
| Operador inválido | `calc(10, 5, "%")` | `Operador inválido, tente (+, -, / ou *)` |
| Operador nulo | `calc(10, 5, null)` | `Operador inválido, tente (+, -, / ou *)` |

> A divisão trabalha com números inteiros (`int`), portanto o resultado não possui casas decimais.

## ▶️ Como executar

**Compilar o projeto:**

```bash
javac -d bin -cp lib/junit-platform-console-standalone-1.14.4.jar src/App.java src/calculadora/*.java
```

**Executar a aplicação:**

```bash
java -cp bin App
```

**Executar os testes:**

```bash
java -jar lib/junit-platform-console-standalone-1.14.4.jar execute --class-path bin --scan-class-path
```

Também é possível rodar tudo pelo **Gerenciador de Testes** do VS Code.

**Gerar a documentação JavaDoc:**

```bash
javadoc -d docs -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 src/calculadora/Calculadora.java
```

Depois, abra o arquivo `docs/index.html` no navegador.

## 🧪 Testes unitários

Os testes ficam na classe `TesteCalculadora` e cobrem as operações e os casos de erro:

| Teste | O que valida |
|---|---|
| `testeSoma` | Soma de dois números |
| `testeSubtracao` | Subtração de dois números |
| `testeMultiplicacao` | Multiplicação de dois números |
| `testeDivisao` | Divisão de dois números |
| `testeDivisaoPorZero` | Mensagem de erro na divisão por zero |
| `testeOperadorInvalido` | Mensagem de erro para operador desconhecido |
| `testeOperadorNulo` | Mensagem de erro para operador nulo |
| `testeEstouroDeInteiro` | Comportamento com valores no limite do tipo `int` |

### Prints da execução dos testes

Resultado: **8/8 testes aprovados**.

![Execução dos testes](img/testes.png)

## 📖 Documentação JavaDoc

A classe `Calculadora` e seus métodos foram documentados com comentários JavaDoc (`@param`, `@return`, `@author`, `@version`).

### Prints da documentação JavaDoc

![JavaDoc - página inicial](img/javadoc-1.png)

![JavaDoc - classe Calculadora](img/javadoc-2.png)

## 🔗 Link do repositório

[https://github.com/GuilhermeR0drigues/Projeto-Calculadora](https://github.com/SEU-USUARIO/Projeto-Calculadora)
