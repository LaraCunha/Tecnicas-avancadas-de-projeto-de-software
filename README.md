# 📘 README — Atividade de Código Limpo

**Disciplina: Técnicas Avançadas de Projeto de Software**

---

## 🎯 Objetivo da Atividade

Esta atividade teve como objetivo aplicar conceitos de **código limpo (Clean Code)** em um projeto simples em Java, focando na melhoria da qualidade do código por meio de refatorações.

A proposta consistiu em analisar um código inicial considerado “sujo” e transformá-lo em um código mais **legível, organizado e de fácil manutenção**, sem alterar seu comportamento principal.

---

## 🧠 Conceitos Trabalhados

Durante a atividade, foram aplicados os seguintes princípios fundamentais:

### 🏷️ Nomes Significativos

* Substituição de nomes genéricos ou pouco descritivos por nomes claros
* Exemplo: `p` → `peso`, `n` → `nome`

---

### 🔁 Evitar Duplicação (DRY)

* Remoção de repetições desnecessárias no código
* Uso de estruturas mais simples para evitar redundância

---

### ✂️ Funções Pequenas e com Responsabilidade Única

* Métodos passaram a realizar apenas uma tarefa específica
* Separação de responsabilidades para facilitar manutenção

---

### 📖 Código Expressivo

* Criação de métodos com nomes que descrevem claramente sua função
* Exemplo: `ehPesada()` ao invés de usar diretamente uma condição

---

### 🧹 Remoção de Código Desnecessário

* Exclusão de métodos redundantes ou sem uso
* Redução de complexidade e poluição visual

---

### 🔒 Encapsulamento

* Cada classe passou a ser responsável por seu próprio comportamento
* O código principal (`Main`) apenas utiliza os métodos, sem conhecer detalhes internos

---

## 🏗️ Estrutura do Projeto

O projeto foi desenvolvido utilizando conceitos básicos de **Programação Orientada a Objetos (POO)**:

* Classe base: `Animal`
* Classes derivadas:

  * `Cachorro`
  * `Gato`
  * `Vaca`

Cada classe implementa seu próprio comportamento por meio do método `emitirSom()`, demonstrando **polimorfismo**.

---

## 🔄 Processo de Refatoração

As principais mudanças realizadas foram:

* Padronização de nomes de variáveis e métodos
* Simplificação de estruturas de repetição
* Redução de código redundante
* Melhoria na organização geral das classes
* Aplicação de boas práticas de design

---

## ✅ Resultados

Após a refatoração, o código tornou-se:

* Mais legível
* Mais simples
* Mais organizado
* Mais fácil de manter e evoluir

Além disso, o projeto passou a refletir melhor os princípios ensinados na disciplina.

---

## 📌 Considerações Finais

A atividade demonstrou a importância de escrever código pensando não apenas na execução, mas também na **leitura e manutenção futura**.

Aplicar boas práticas desde o início reduz problemas, melhora a colaboração entre desenvolvedores e aumenta a qualidade do software.

---
