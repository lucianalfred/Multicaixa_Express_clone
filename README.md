# Mulicaixa Express Clone

> Clone funcional e educacional do **Mulicaixa Express**, desenvolvido com o objetivo de estudar, praticar e demonstrar competências em **desenvolvimento mobile**, **APIs**, **arquitetura de software** e **integração frontend–backend**.

Este projeto faz parte do meu **portfólio pessoal** e não possui qualquer vínculo oficial com a EMIS ou com o aplicativo original Mulicaixa Express.

---

## Objetivo do Projeto

O objetivo principal deste projeto é:

* Simular o funcionamento de um **aplicativo de Internet Banking**
* Aplicar boas práticas de **arquitetura mobile e backend**
* Trabalhar com **APIs REST**, autenticação e segurança
* Separar responsabilidades entre **frontend (mobile)** e **backend**
* Demonstrar capacidade de construir um sistema completo, do zero

---

## Arquitetura Geral

O projeto está dividido em **duas branches principais**, cada uma representando uma camada do sistema:

```
Mulicaixa-Express-Clone
├── mobile    → Aplicação Android
└── backend   → API REST (Servidor)
```

Essa separação reflete um cenário real de produção, onde o aplicativo consome serviços de uma API independente.

---

## Branches do Projeto

###  Branch `mobile`

Contém a implementação da **aplicação Android**, responsável pela interface do utilizador.

**Principais responsabilidades:**

* Interface gráfica (UI/UX)
* Autenticação do utilizador
* Consumo da API REST
* Visualização de saldo e operações
* Simulação de transferências e pagamentos

**Tecnologias previstas:**

* Android (Kotlin ou Java)
* Arquitetura MVVM
* Retrofit / HTTP Client
* Material Design

---

### Branch `backend`

Contém a **API REST**, responsável pela lógica de negócio e persistência de dados.

**Principais responsabilidades:**

* Autenticação e autorização
* Gestão de utilizadores
* Contas bancárias e saldos
* Registo de transações
* Comunicação segura com o mobile

**Tecnologias previstas:**

* Backend (ex: Django / Node.js)
* API RESTful
* JWT para autenticação
* Base de dados relacional
* Arquitetura em camadas (Controllers, Services, Repositories)

---

## Funcionalidades Planeadas

* [ ] Registo e login de utilizadores
* [ ] Autenticação com JWT
* [ ] Consulta de saldo
* [ ] Histórico de transações
* [ ] Transferências entre contas
* [ ] Simulação de pagamentos de serviços
* [ ] Validações e tratamento de erros
* [ ] Logs e boas práticas de segurança

---

## Conceitos Aplicados

Este projeto explora conceitos importantes como:

* Separação de responsabilidades
* Consumo de APIs
* Arquitetura em camadas
* Clean Code
* Versionamento com Git e GitHub
* Boas práticas de segurança
* Pensamento orientado a produto

---

## Aviso Legal

> Este projeto é **apenas para fins educacionais**.

* Não é um aplicativo oficial
* Não realiza transações reais
* Não utiliza dados reais
* Não possui ligação com o Mulicaixa Express original

---

##  Autor

**Luciano Alfredo**
Estudante e Desenvolvedor de Software
 Angola

> Projeto desenvolvido com foco em aprendizagem contínua e evolução técnica.

---

## Próximos Passos

* Implementar a API base
* Criar autenticação segura
* Integrar mobile com backend
* Refinar UI/UX
* Documentar endpoints da API

---
