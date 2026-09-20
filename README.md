# Task List Challenge in Kotlin

[Português](#português) · [English](#english) · [C4 Model](docs/architecture/C4.md)

Aplicação de linha de comando criada para praticar os fundamentos de Kotlin por meio de um gerenciador de tarefas em memória.

## Português

### Visão geral

O **Desafio Lista de Tarefas com Kotlin** é um projeto educacional executado no terminal. A aplicação representa tarefas com uma `data class`, mantém os registros em uma coleção mutável e oferece operações básicas de inclusão, exclusão, atualização e consulta.

### Funcionalidades

- cadastrar uma tarefa com título, descrição, status e data;
- gerar um identificador numérico aleatório;
- excluir uma tarefa pelo ID;
- atualizar os dados de uma tarefa;
- visualizar as tarefas disponíveis;
- praticar `data class`, funções, condicionais, coleções e entrada de dados pelo console.

### Arquitetura

```text
Pessoa usuária -> Aplicação CLI em Kotlin -> Lista de tarefas em memória
```

O projeto está concentrado em um único arquivo. Os componentes lógicos e o fluxo de inclusão estão documentados em [docs/architecture/C4.md](docs/architecture/C4.md).

### Tecnologias

| Área | Tecnologia |
|---|---|
| Linguagem | Kotlin |
| Plataforma | JVM |
| Interface | Terminal / entrada padrão |
| Persistência | Coleção `MutableList` em memória |

### Estrutura

```text
.
├── Desafio.kt                    # modelo, menu e operações
├── README.md                     # documentação bilíngue
└── docs/architecture/C4.md       # arquitetura C4 e fluxo principal
```

### Como executar

Use uma IDE com suporte a Kotlin, como IntelliJ IDEA, ou o compilador de linha de comando:

```bash
kotlinc Desafio.kt -d out
kotlin -classpath out desafios.DesafioKt
```

Ao iniciar, escolha uma das opções exibidas:

| Opção | Operação |
|---|---|
| `1` | Adicionar tarefa |
| `2` | Excluir tarefa |
| `3` | Atualizar tarefa |
| `4` | Visualizar tarefas |

### Modelo de tarefa

```kotlin
data class Tasks(
    val id: Int,
    val title: String,
    val description: String?,
    val isCompleted: Boolean,
    val dateCreatedAt: String,
)
```

### Estado atual e limitações

- os dados existem apenas durante a execução e não são persistidos;
- o programa executa uma única operação e depois é encerrado;
- as opções de exclusão, atualização e listagem carregam duas tarefas de demonstração;
- entradas numéricas inválidas podem encerrar o programa com erro;
- o ID aleatório não possui verificação de colisão;
- ainda não há testes automatizados nem configuração de build no repositório;
- nomes e funções podem ser refinados para seguir as convenções idiomáticas de Kotlin.

---

## English

### Overview

**Task List Challenge in Kotlin** is an educational command-line application. It models tasks with a Kotlin `data class`, stores them in a mutable in-memory collection, and demonstrates basic create, delete, update, and list operations.

### Features

- create a task with title, description, status, and date;
- generate a random numeric identifier;
- delete a task by ID;
- update task data;
- display the available tasks;
- practice functions, conditionals, collections, and console input.

### Architecture and stack

The user interacts with a Kotlin/JVM CLI. The application coordinates the menu and task operations, while a `MutableList<Tasks>` acts as temporary storage. See [docs/architecture/C4.md](docs/architecture/C4.md) for the C4 diagrams and the create-task sequence.

### Running the project

Open `Desafio.kt` in a Kotlin-capable IDE or run:

```bash
kotlinc Desafio.kt -d out
kotlin -classpath out desafios.DesafioKt
```

### Current status

This is a learning project rather than a production task manager. Data is not persisted, only one menu action is executed per run, demo data is inserted for some operations, and automated validation and tests are not yet included.

## License

No license file is currently included in this repository.
