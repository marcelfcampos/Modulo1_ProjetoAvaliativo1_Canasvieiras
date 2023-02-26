# Modulo1_ProjetoAvaliativo1_Canasvieiras

Projeto avaliativo relacionado ao Back-End 

Turma: Canasvieiras
Autor: Marcel Ferreira Campos

Criar a API Rest do LabBeach


PROPRIEDADES DA APLICAÇÃO:

* Nome do usuário do banco de dados: postgres
* password: 32449173

spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.database.driverClassName=org.postgresql.Driver

spring.datasource.url=jdbc:postgresql://localhost:5432/labparadises
spring.datasource.username=postgres
spring.datasource.password=32449173
server.port=8080
spring.datasource.driver-class-name=org.postgresql.Driver

spring.datasource.testWhileIdle=true
spring.datasource.validationQuery=SELECT 1

spring.jpa.properties.hibenate.dialect=org.hibernate.dialect.PostgreSQL10Dialect


* ENDPOINTS BAIRROS:  localhost:8080/caminho

("/bairros")

("bairros/lista")

("bairros/id") 

* ENDPOINTS PRAIAS:  localhost:8080/caminho

("/praia")

("praia/lista")

("praia/id") 

FuturoDEV
Módulo 1 - Projeto Avaliativo 1

REQUISITOS DA APLICAÇÃO:
Aplicação Desenvolvida para controle das praias de Florianópolis, criando o Back-End de um sistema de praias com os seguintes requisitos;
  • Cadastro de bairro
  • Listagem de bairro
  • Exclusão de bairro
  • Cadastro de praia
  • Listagem de praias
  • Edição de praias por identificador
  • Exclusão de praias por identificador
  • Listagem de praias conforme o status
  • Listagem de praias com acessibilidade
  • Listagens de praias por população no bairro

ROTEIRO DA APLICAÇÃO:
A aplicação realizada individualmente deverá seguir os requisitos apresentados à seguir.

  •	REQUISITO GERAL DA APLICAÇÃO:
      •	Utilização de Spring: Boot, MVC, Data
      •	Criação de API Rest
      •	Utilização de Git com GitHub
      •	Uso do banco de dados PostgreSQL
      
  •	CADASTRO DE BAIRRO:
      •	Não permitir cadastro duplicado
      •	Não permitir cadastro com campos inválidos
      •	Campos necessários:
          •	Identificador da categoria: Único, autogerado.
          •	Nome do bairro: Única, tipo texto, preenchimento obrigatório.
          •	Descrição do bairro: Tipo texto, preenchimento não obrigatório.
          •	População do bairro: Tipo inteiro, preenchimento não obrigatório.
          
  •	LISTAGEM DE BAIRROS:
      •	Listar todas os bairros cadastrados com seus respectivos campos
      
  •	EXCLUSÃO DE BAIRRO:
      •	Deletar um bairro por identificador
      •	Não permitir deletar um bairro caso tenha uma praia cadastrada.
  
  •	CADASTRO DE PRAIA:
      •	Não permitir cadastro duplicado
      •	Não permitir cadastro com campos inválidos
      •	Campos necessários:
          •	Identificador da praia: Único, autogerado
          •	Identificador do bairro: Utilizar categoria válida e já criada
          •	Nome da praia: Tipo texto, preenchimento obrigatório
          •	Possui acessibilidade: Tipo booleano, preenchimento obrigatório
          •	Status da praia (própria, imprópria): Tipo texto, preenchimento obrigatório.
          
  •	LISTAGEM DE PRAIAS:
      •	Listar todos as praias cadastradas com seus respectivos campos.
  
  •	EDIÇÃO DE PRAIA:
      • Editar as informações da praia por identificador.
  
  •	EXCLUSÃO DE PRAIA:
      • Deletar uma praia por identificador.
      
  •	LISTAGEM DE PRAIAS CONFORME O STATUS
      •	Listar praias conforme o status (própria ou imprópria)
 
 •	LISTAGEM DE PRAIAS COM ACESSIBILIDADE
      •	Listar praias por acessibilidade ( verdadeiro ou falso ) 

 •	LISTAGENS DE PRAIAS POR POPULAÇÃO NO BAIRRO
    •	Listar praias com população até um certo número definido pelo usuário.
        •	Ex. praias em bairros com população até 15000 pessoas.













