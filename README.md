# Modulo1_ProjetoAvaliativo1_Canasvieiras

Projeto avaliativo relacionado ao Back-End 

Turma: Canasvieiras
Autor: Marcel Ferreira Campos

Criar a API Rest do LabBeach

REQUISITOS DA APLICAÇÃO:
Aplicação Desenvolvida para controle das praias de Florianópolis, criando o Back-End de um sistema de praias com os seguintes requisitos;

Cadastro de bairro
Listagem de bairro
Exclusão de bairro
Cadastro de praia
Listagem de praias
Edição de praias por identificador
Exclusão de praias por identificador
Listagem de praias conforme o status
Listagem de praias com acessibilidade
Listagens de praias por população no bairro


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








