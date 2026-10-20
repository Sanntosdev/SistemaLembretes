# 📝 Sistema de Lembretes

Um sistema de lembretes desenvolvido em Java para praticar programação, orientação a objetos e manipulação de arquivos. O projeto nasceu como uma forma de aplicar os conhecimentos adquiridos nos estudos e construir uma aplicação útil no dia a dia.

## 🚀 Sobre o projeto

O Sistema de Lembretes permite cadastrar e visualizar lembretes organizados por título, descrição e categoria. Os dados podem ser armazenados em um arquivo TXT, permitindo manter um registro das informações.

O projeto também foi configurado para facilitar sua execução no Windows, com inicialização automática do sistema, acesso por atalho e execução pelo terminal.

## ✨ Funcionalidades da V1.0

- **Cadastro de lembretes:** registro de título, descrição e categoria.
- **Visualização:** exibição dos lembretes armazenados.
- **Validação de dados:** verificação dos limites de caracteres dos campos.
- **Persistência em TXT:** gravação dos dados em arquivo de texto.
- **Inicialização com o Windows:** configuração para iniciar o programa automaticamente.
- **Atalho de execução:** acesso ao programa por meio de um atalho.
- **Execução pelo terminal:** possibilidade de iniciar o programa utilizando o terminal do Windows.

## 🛠️ Tecnologias e conceitos utilizados

- Java
- Programação Orientada a Objetos (POO)
- Encapsulamento
- `ArrayList`
- Manipulação de arquivos com `FileReader`, `FileWriter`, `BufferedReader` e `BufferedWriter`
- Tratamento de exceções
- Validação de dados
- Organização em pacotes

## 📂 Organização do projeto

O código foi organizado em pacotes para separar as responsabilidades da aplicação:

- `app`: contém a classe principal e o ponto de entrada do programa.
- `model`: contém a classe `Lembrete` e seus atributos.
- `service`: concentra a lógica de gerenciamento dos lembretes.
- `persistencia`: responsável pelas operações de leitura e escrita do arquivo TXT.

## ▶️ Como executar

O projeto foi desenvolvido em Java e configurado para execução no Windows.

É possível iniciar o programa por meio do atalho criado ou pelo terminal, conforme a configuração local.

Para executar o código-fonte, é necessário ter um JDK compatível instalado e abrir o projeto em uma IDE Java, como o IntelliJ IDEA.

**Observação:** a inicialização automática com o Windows e o atalho dependem das configurações realizadas na máquina em que o programa está instalado.

## 🔧 Melhorias planejadas

A V1.0 representa uma etapa funcional do projeto, mas ainda existem melhorias a implementar:

- [ ] Carregar os lembretes do TXT automaticamente ao iniciar o programa.
- [ ] Corrigir a persistência para evitar a duplicação de registros.
- [ ] Implementar a remoção de lembretes pelo terminal.
- [ ] Atualizar o arquivo TXT corretamente após alterações.
- [ ] Aprimorar as validações, solicitando novamente os dados inválidos.

## 🎯 Objetivo de aprendizado

Este projeto faz parte da minha jornada de aprendizado em desenvolvimento de software, com foco em Java e backend.

Mais do que concluir uma aplicação, o objetivo é desenvolver a capacidade de resolver problemas, organizar código, trabalhar com persistência de dados e evoluir uma solução de forma incremental.

A V1.0 marca uma etapa importante dessa jornada, e o projeto continuará evoluindo conforme novos conhecimentos forem adquiridos.

---

**Status:** V1.0 — primeira versão publicada no GitHub.

Desenvolvido por Diogo Cerqueira Santos.
