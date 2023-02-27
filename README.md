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


BAIRRO E PRAIA DE FLORIANÓPOLIS / SC:

      BAIRRO: COQUEIROS

      1. Identificador do bairro (id): Único, autogerado.

      2. Nome do bairro: Coqueiros. (Tipo texto)

      3. Descrição do bairro: Destaca-se pelas opções de lazer, entretenimento e gastronomia. (Tipo texto)

      4. População do bairro: 14.000 - 14 mil habitantes (Tipo inteiro)

_______________________________________________________________________________________________________

      PRAIA : PRAIA DO RISO - BAIRRO COQUEIROS

      1. Identificador da praia: (id): Único, autogerado.

      2. Identificador do bairro: Utilizar categoria válida e já criada

      3. Nome da praia: Praia do Riso

      4. Possui acessibilidade: verdadeiro/falso (sim ou não) - (Tipo booleano): não

      5. Status da praia (própria, imprópria): imprópria (Tipo texto)
      
      
      
      
      
 MATERIAL RESUMO DE APOIO COMPLEMENTAR:
 
* Criar uma API, utilizando os métodos de acesso: Adicionar uma dependência extra no nosso arquivo pom.xml (acessar mvn (maven) site: https://mvnrepository.com -> search (procurar por):  >> Spring Boot Starten Web << adicionar no pom.xml nas < dependency > (dependências)

* Feito o recarregamento do pom.xml o maven (mvn) baixar essa dependência do >> Spring Boot Starten Web <<

1.models (Package): camada que possui a lógica da aplicação, responsável pelas regras de negócios, persistência com banco de dados e as classes de entidades. O models (modelo) recebe as requisições vindas do controller e gera respostas a partir destas requisições.

** @Entity: é um objeto leve de domínio persistente utilizado para representar uma tabela da base de dados, sendo que cada instância da entity corresponde a uma linha da tabela.


2.Repository (Package): É um padrão de projeto que visa mediar a pesquisa de objetos do domínio entre a camada de mapeamento de dados, usando uma interface semelhante à de uma coleção, essa camada de domínio filtra a coleção em memória.

Requisitos do Projeto LabBeach:
*BairroRepository
*PraiaRepository

3.services (Package): camada intermediária entre os controllers e o repository, fazendo algum processamento adicional caso seja necessário.

* O que são classes Services? * -> Essa annotation serve para determinar as classes de serviço da aplicação. Geralmente é nessas classes que são injetados os DAOs e feito as operações de inserção, deleção, atualização, etc.

Já nas classes DAO é comum ser usado a anotação @Repository que define as classes responsáveis da camada de persistência.

//Na camada  de Service importamos um Repository da entidade (Bairro) e invocamos um método (função, subrotina) apartir de uma instância (novo objetodo criado no mesmo tipo da classe) desse repository
//Como fazemos uma instância do (ex: BairroRepository) se o BairroRepository é uma interface.
//Aqui entramos no conceito de injeçao de depenência, que o um designer father ou um padrão de projeto que define que uma classe jamais vai instanciarum objeto que ela precisa instaciar.
//Esse Objeto que ela precisa utilizar, precisa ser fornecido pronto, já instanciado para a classe que irá utilizar ele.
//Spring facilita justamente essa injeção de indepêndencia.

4.controllers(Package): guarda as classes do tipo controllers onde organizam os endpoint, e os endpoint são os endereços onde a API será acessada.


-----> Geralmente temos um Repositorys, um Services e um Controllers para cada entidade (Cada classe) do Models.

-----> Anotação de Classes:
* @RestController

* @RestRepository

OBSERCAÇÕES ABAIXO:

*MÉTODO: Um método em Java é equivalente a uma função, subrotina ou procedimento em outras linguagens de programação. Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe

*INSTÂNCIA: Uma instância de uma classe é um novo objeto criado dessa classe, com o operador new. Instanciar uma classe é criar um novo objeto do mesmo tipo dessa classe. Uma classe somente poderá ser utilizada após ser instanciada.

*SPRING: é um framework Java criado com o objetivo de facilitar o desenvolvimento de aplicações, explorando, para isso, os conceitos de Inversão de Controle e Injeção de Dependências.

*SPRING BOOT: 
Para adicionar uma nova <<dependeria>> não precisa ir novamente no Spring initializr, para criar um novo SPRING BOOT,  para adicionar essa <dependency>, podemos simplesmente , fazer o que foi feito com o drive do post pgAdmin e adicionar uma <dependency> extra no nosso arquivo pom.xml > vamos no MVNRepository https://mvnrepository.com/ , buscar por Spring Boot Starter Web >> Versão (exemplo: Spring Boot Starter Web >> V3.0.2 ), pegar a versão que estamos mexendo no Spring Boot do nosso projeto e copiar o código xml. para adicionar no pom.xml. Adiciona entre as dependências no nosso projeto:

</dependency>
……
<dependency>

Web inicial do Spring Boot:
Starter(Iniciante) para construir aplicações web, incluindo RESTful, usando Spring MVC. Usa o Tomcat como o contêiner incorporado padrão

Acesso URL do MVNRepository: https://mvnrepository.com/
Acesso URL do Spring initializr : https://start.spring.io/
Obs: Fazer o recarregamento das dependências do pom.xml (pelo ícone (m) ou atalho) (editado) 


** Orientação a Objetos:Linguagem de Programação diz respeito aos dados: (https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264)
******Programação Estruturada vs Programação Orientada a Objetos: (https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264)


** Id: A anotação @ID é utilizada para informar ao JPA qual campo/atributo de uma entidade estará relacionado à chave primária da respectiva tabela no banco de dados. Essa é uma anotação obrigatória e um erro será gerado em tempo de execução caso ela não esteja presente.

** GenerationType.IDENTITY: Informamos ao provedor de persistência que os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados. Assim, um valor para o identificador é gerado para cada registro inserido no banco.

** Provedor de persistência: Um provedor de persistência JPA usa os elementos a seguir para permitir um gerenciamento de persistência mais fácil em um ambiente do EJB 3. x: Unidade de persistência. Define um Objeto Completo-Modelo Relacional mapeando classes Java (entidades + estruturas de suporte) com um banco de dados relacional.

** JPA: O que é  JPA (ou Java Persistence API) é uma especificação oficial que descreve como deve ser o comportamento dos frameworks de persistência Java que desejarem implementá-la. Ser uma especificação significa que a JPA não possui código que possa ser executado.

** Endpoint: é basicamente o que um serviço expõe e esse serviço pode ser acessado por uma aplicação, muitas vezes acaba sendo confundido com uma API, mas vale ressaltar que não é. Simplificando um endpoint de um web service é a URL onde o serviço pode ser acessado por uma aplicação cliente. Um modelo típico de implementação de um endpoint pode ser interpretado assim:

	[ Clinte ] ...<->... [ Endpoint ]...<-> ... [ API ]


** API: conjunto de rotinas, protocolos e ferramentas para construir aplicações.






 
 








