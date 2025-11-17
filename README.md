# 🎓 Desafio: Gerenciador de Notas em Kotlin e Jetpack Compose

## 🎯 Objetivo da Atividade

Desenvolver uma aplicação Android utilizando **Kotlin** com foco em **Programação Orientada a Objetos (POO)** para gerenciar as notas parciais de um aluno. A interface gráfica (UI) deve ser construída exclusivamente com **Jetpack Compose**.

## ⚙️ Requisitos Chave do Projeto

O projeto cumpre os seguintes requisitos funcionais e técnicos obrigatórios:

### Requisitos Funcionais

1.  **Cadastro e Notas:** Permite inserir o **Nome do Aluno** e as **três notas parciais (TP1, TP2, TP3)**.
2.  **Cálculo:** Realiza o cálculo da **Média Geral** (aritmética) das três notas.
3.  **Avaliação:** Exibe o status final do aluno com base na Média, seguindo a lógica:
    * Reprovado: Média < 6.0
    * Aprovado: Média $\geq$ 6.0 e $\leq$ 9.0
    * Ótimo Aproveitamento: Média > 9.0

### Requisitos Técnicos Obrigatórios

* **POO:** Uso de Classes/Data Classes (`Aluno.kt`) para modelar a entidade e encapsular a lógica de cálculo.
* **UI:** Uso exclusivo da biblioteca **Jetpack Compose**.
* **Gerenciamento de Estado:** Uso de funções reativas do Compose (`remember`, `mutableStateOf`) para atualizar a UI.
* **Estrutura de Dados:** Uso obrigatório de **`MutableList<Double>`** para gerenciar as notas dentro da classe do aluno.

---


## 📝 Padrão de Commits

Todos os commits deste projeto seguem o padrão de mensagens adotado pelo repositório **iuricode/padroes-de-commits**.

* **Referência:** [https://github.com/iuricode/padroes-de-commits](https://github.com/iuricode/padroes-de-commits)

---



**Aluno:** **Vinícius Souza Ramos**
