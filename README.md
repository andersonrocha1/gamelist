# GameList App
![GameList](https://github.com/andersonrocha1/assets/assets/23089093/68142dd5-40ee-4280-8992-2526ea05a74f)

Criando o Back-End de uma coleção de games em um treinamento intensivo de Java + Spring Boot.

## Índice
- <a href="#tecnologiasutilizadas">Tecnologias Utilizadas</a>
- <a href="#bancosutilizados">Banco de Dados</a>
- <a href="#padroesutilizados">Padrões do Projeto</a>
- <a href="#perfisprojeto">Perfis de Projeto</a>
- <a href="#homologacao">Passos de Homologação</a>
- <a href="#deploy">Passos de Deploy CI/CD</a>
- <a href="#aprendizado">Aprendizado</a>
- <a href="#contatos">Contatos</a>
- <a href="#agradecimentos">Agradecimentos</a>

##   Linguagens Utilizadas

  - [x] Java
  - [x] SQL
  - [x] Spring Boot
  - [x] Docker

## Banco de Dados

  - [x] Banco de dados H2 - Testes
  - [x] Banco de dados Postgres


## Padrões do projeto

- API REST

    ### Padrão Rest

        • Cliente/servidor com HTTP
        • Comunicação stateless (*)
        • Interface uniforme, formato padronizado (*)
        • Cache
        • Sistema em camadas
        • Código sob demanda (opcional)

    ### Padronização

        GET https://meusistema.com/produtos
        GET https://meusistema.com/produtos/5
        POST https://meusistema.com/produtos         
        { ... }
        PUT https://meusistema.com/produtos/5
        { ... }
        DELETE https://meusistema.com/produtos/5


## Padrão Camadas

![Camadas](https://user-images.githubusercontent.com/23089093/239023317-bf27fd4c-82b4-4a77-887d-3e88dd0d1511.png)


## Perfis de Projeto

1. Perfil de desenvolvimento e testes:
    - test
        - Banco de dados H2
2. Perfil de homologação / staging:
    - dev
        - Banco de dados Postgres de homologação
3. Perfil de produção:
    - prod
        - Banco de dados Postgres de produção


## Passos Homologação

* Preparação do Ambiente

    Docker
    ou
    Postgresql + pgAdmin ou DBeaver
Homologação local

1. Criar perfis de projeto
    * system.properties
2. Gerar script da base de dados
    * apagar arquivo gerado
3. Criar base de dados de homologação
4. Rodar app no modo dev e validar


## Passos de Deploy CI/CD

* Pré-requisitos:

    - [x] Conta no Railway
    - [x] Conta no Github com mais de 90 dias
    - [x] Projeto Spring Boot no seu Github
    - [x] Script SQL para criação e seed da base de dados
    - [x] App de gestão de banco instalado(pgAdmin ou DBeaver)

* Passos Railway

1. Prover um servidor de banco de dados

2. Criar a base de dados e seed

3. Criar uma aplicação Railway vinculada a um
repositório Github

4. Configurar variáveis de ambiente
    ```
        APP_PROFILE
        DB_URL (Formato:
        jdbc:postgresql://host:porta/nomedabase)
        DB_USERNAME
        DB_PASSWORD
        CORS_ORIGINS
    ```
5. Configurar o domínio público para a aplicação

6. Testar app no Postman

7. Testar a esteira de CI/CD


## Aprendizado

• Conceitos

        • Sistemas web e recursos
        • Cliente/servidor, HTTP, JSON
        • Padrão Rest para API web
    • Estruturação de projeto Spring Rest
    • Entidades e ORM
    • Database seeding
    • Padrão camadas
        • Controller, service, repository
    • Padrão DTO
    • Perfis de projeto
    • Ambiente local com Docker Compose
    • Processo de homologação local
    • Processo de deploy com CI/CD
    • Configuração de CORS
    
• Abordagens interessantes

    • Relacionamentos N-N
    • Classe de associação, embedded id
    • Consultas SQL no Spring Data JPA
    • Projections(EX: Busca de games por lista de games)



## Contatos

* Links    
<a href= "https://www.linkedin.com/in/anderson-rocha-228231222/">Linkedin : Anderson</a>



## Agradecimentos

* Link DevSuperior, uma escola fantástica

    <a href= "https://www.linkedin.com/school/devsuperior/">Escola DevSuperior</a>







