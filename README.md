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
______________________________________________________________________________________________________________________

***** O QUE SIGNIFICA CADA PALAVRA RESERVADA: (https://www.devmedia.com.br/o-que-significa-cada-palavra-reservada/8320)
**** Muita gente imagina que para estudar a linguagem Java tem que aprender (decorar) todas as palavras reservadas, pois temos que usá-las de forma que não causem erros em nossas programações.
*** O que precisamos entender mesmo é como são divididas e quando vamos usá-las, elas são divididas em: modificadores de acesso, modificadores de classe, método e variável, controle de fluxo, tratamento de erros, controle de pacotes, primitivas, palavras-chaves de variáveis, void para retornos e também as palavras reservadas não utilizadas.

** PALAVRAS RESERVADAS

* MODIFICADORES DE ACESSO:

·private: Faz com que um método ou variável possa ser acessado somente de dentro da própria classe;

·protected: Faz com que um método ou variável possa ser acessado somente por classes do mesmo pacote ou por subclasses da classe;

·public: Faz com que uma classe, método ou variável possa ser acessado a partir de qualquer outra classe.


* MODIFICADORES DE CLASSE, MÉTODO E VARIÁVEL:

·abstract: Usada para declarar uma classe que não pode ser instanciada ou método que deve ser implementado por subclasses concretas;

·class: Palavra chave para identificar uma classe;

·extends: Usada para estender uma classe a outra, isto é, indicar para uma superclasse que uma subclasse está estendendo, (herança);

·implements: Usada para indicar a uma interface que uma classe a implementará;

·interface: Palavra chave para identificar uma interface;

·native: Indica que um método foi escrito em uma linguagem que só pode ser usada em uma plataforma, exemplo o C++;

·new: Usada para instanciar um objeto;

·static: Indica que o método ou a variável pertence a classe e não a instancia;

·strictfp: Usada na frente de um método para indicar que os números de ponto flutuantes seguirão regras restritas de ponto flutuante em todas as expressões;

·Método: Indica que a variável pode não ficar sincronizada por ser usada em fragmentos.

·syncronized: Indica que um método só pode ser acessado por um seguimento de cada vez;

·transient: Impede que os campos sejam serializados;

·volatile: Indica que a variável pode não ficar sincronizada por ser usada em fragmentos.


* CONTROLE DE FLUXO:

·break: Faz o fluxo sair do bloco do código onde a palavra foi inserida.

·case: Executa um bloco de código dependendo da instrução switch.

·continue: Faz com que o código existente após essa instrução não seja executado em um loop, indicando a próxima interação do loop.

·default: Executará esse bloco de código se nenhuma das instruções switch/case for atendida.

·do: Executa um bloco de código uma vez e, em seguida junto com a instrução while, processa um teste para determinar se o bloco deve ser executado novamente.

·else: Executa um bloco de código alternativo se uma condição if for falsa.

·for: Usada para executar um loop condicional em um bloco de código.

·if: Usada para executar um teste lógico verdadeiro ou falso.

·instanceof: Determina se um objeto é a instancia de uma classe, superclasse ou interface.

·return: Faz o fluxo sair de um método sem executar nenhum código que seja após a instrução (pode retornar uma variável opcionalmente);

·switch: Indica a variável a ser confrontada com as instruções case.

·while: Executa um bloco de código repetidamente, enquanto um certa condição for verdadeira.


* TRATAMENTO DE ERROS:

·catch: Declara o bloco de código usado para tratar uma execução.

·finally: Bloco de código, geralmente após uma instrução try-catch, que vai ser executado independente de que fluxo do programa for usado no tratamento de uma exceção.

·throw: Usada para passar uma execução para o método que chamou o método atual.

·throws: Indica o método que passará uma execução para o método que o chamou.

·try: Bloco de código que será executado, podendo, porém, causar uma exceção.

·assert: Avalia uma expressão condicional para verificar as alternativas do programador.


* CONTROLE DE PACOTES:

·import: Fala-se que é para importar pacotes ou classes para o código, o que não é verdade.

·package: Especifica a que pacote todas as classes de um arquivo fonte pertence.


* PRIMITIVAS:

·boolean: Verdadeiro ou Falso;

·byte: Inteiro de 8 bits (com sinal);

·char: Unidade Unicode (de 16 bits, sem o sinal);

·double: Número de ponto flutuante com 64 bits (com sinal);

·float: Número de ponto flutuante com 32 bits (com sinal);

·int: Número inteiro de 32 bits (com sinal);

·long: Número inteiro de 64 bits (com sinal);

·short: Número inteiro de 16 bits (com sinal);


* PALAVRAS CHAVES DE VARIÁVEIS:

·super: Variável de referência que diz respeito a superclasse imediata;

·this: Variável de referência que diz respeito a instancia atual de um objeto;


* PALAVRA VOID PARA TIPOS RETORNADOS:

·void: Indica que não há um tipo de retorno para o método


* PALAVRAS RESERVADAS NÃO UTILIZADAS:

·const: Não use esta palavra para declarar constantes use public static final;

·goto: Não foi implementada na linguagem Java por ser considerada perigosa.


______________________________________________________________________________________________________________________


** DIFERENÇA entre as ANOTAÇÕES @Repository e @Service

https://www.youtube.com/watch?v=a_LbYXUzZWs

** Frameworks: grupos de códigos previamente escritos usados pelos desenvolvedores para criar aplicações por meio da linguagem de programação Java.

** Padrão de Projeto: Muitas vezes dividimos um sistema em camadas, separar o projeto em camadas faz com que o nosso sistema seja colocado dentro de um padrão. Entre as camadas existentes podemos destacar a interface do usuário que diz respeito a toda parte visual que o usuário interage com telas, avisos, validações, avisos que precisam ser feitos, tudo isso diz respeito a interface do usuário, então todo código que diz respeita a isso vai nessa camada de interface do usuário. Outra camada que temos e a camada de regras de negócio (pacote models, camada que possui a lógica da aplicação, responsável pelas regras de negócios), toda validação, toda a lógica do sistema que será desenvolvida vai ser programada nessa camada, ainda temos a camada chamada de acesso a dados que pode ser chamada de persistência, responsável por acessar e manipular todas as informações que vão ser registradas ou em um banco de dados ou arquivo xml e todas essas camadas se comunicam com uma camada chamada modelo de domínio que vai modelar todas as informações que compões o nosso sistema. É importante entender essa divisão por camadas dentro de um padrão de projetos, porque o Spring foi criado dentro de um padrão de projeto.

1.CAMADA INTERFACE DO USUÁRIO

2.CAMADA DE REGRAS DE NEGÓCIO: (pacote models, camada que possui a lógica da aplicação, responsável pelas regras de negócios)

3.CAMADA DE ACESSO A DADOS

*Esquema de entendimento abaixo*

	INTERFACE DO USUÁRIO -> REGRA DE NEGÓCIO -> [( ACESSO A DADOS ) -> acessa Banco de Dados e XML )]

	[ INTERFACE DO USUÁRIO + REGRA DE NEGÓCIO + ACESSO A DADOS -> acessam MODELO DE DOMÍNIO ]

ANOTAÇÕES: Quando deve-se usar @Repository e quando deve usar @Servide no Spring MUC ?

No esquema acima, as camadas REGRA DE NEGÓCIO e ACESSO A DADOS, quando pensamos que precisamos acessar ou manipular qualquer tipo de informação que seja diretamente do BANCO DE DADOS, ou seja:

1.CRIAR
2.LER
3.GRAVAR
4.ATUALIZAR, informações do banco de dados

O famoso CRUD, iremos utilizar uma anotação @Repository, inclusive temos uma interface automáticamente cria todos os métodos que precisamos para CRIAR, LER, ATUALIZAR, DELETAR, todo tipo de dados que precisam daquela entidade determinada. Com isso conseguimos otimizar o nosso trabalho, não precisamos a todo momento escrever o método como salvar, é sempre igual.
Então criamos a INTERFACE e vai EXTENDER CrudRepository com o tipo da que quer utilizar:



	public interface classeRepository extends CrudRepository<classe,Long> {

		public class findByLo
	}

________________________________________________________________________________

Exemplo do projeto Lab Beach:

	public interface bairroRepository extends CrudRepository<bairro,Long> {

	
	}


** Uma das vantagens de usar anotação @Repository para tratar o acesso ao banco de dados, é que já trata toda e qualquer exceção que pode ocorrer no acesso aos dados, e replica, reenvia essa exceção para ser tratada em outras camadas. Toda a lógica do sistema, todas as REGRAS DE NEGÓCIO, a validação fizer uma verificação por exemplo:
Você tem um método que o usuário vai solicitar a recuperação de uma senha, terás uma tela onde o usuário vai fazer essa solicitação de recuperação de senha, tendo um CONTROLLER que vai mostrar isso a ele. Para o processo verificar efetivamente se este usuário está ativo, se realmente pode ser feita esta solicitação de senha, toda a REGRA DE NEGÓCIO, toda a LÓGICA DO TEU PROGRAMA, deverás inserir dentro do SERVICE (@Service), quando faz isso, pode reutilizar em outro mecanismo.

Exemplo: Tendo o Spring em uma camada de serviço que realiza essa verificação e esse envio de uma nova senha por email , essa CLASSE pode ser utilizada tanto por uma interface WEB, onde o usuário solicita, criando uma API Rest para usar na aplicação, quando o usuário solicitar a mesma senha, o processo de recuperação será a mesma, a validação é a mesma, simplesmente só chama esse serviço que já foi criado. Exemplos:


	@Repository
	public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

		public Usuario findByLogin(String login);

		public List<Usuario> findByLoginContainingIgnoreCase(String login);

	}

------------------------------------------------------------------------------

	@Service
	public class UsuarioService {

		public void recuperarSenha(Usuario usuario) throw Exception {

			if (usuario.isEnabled()) {

				enviaEmail("Recuperação de Senha",usuario);

			} else
				throw new Exception("Usuário inativo!") 
 

XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


CRUD:



XXXXXX LAB365 - Spring 04 - Aç  :tps://www.youtube.com/watch?v=h3MLrR-DuLw XXXXXX

API REST é uma abstração de arquitetura de software que fornece dados em um formato padronizado para modelos de requisições HTTP. Por exemplo, sites em WordPress podem conter plugins que acessam páginas de redes sociais para tornar a interação com o conteúdo mais atrativa e interativa.

Endenter o que é uma API REST, no vídeo anterior criamos uma Api com um endpoint, para receber requisições post e salvar produtos na base.

** API: -> Application Programming Interface e que podemos traduzir como Interface de Programação de Aplicativo. Elas são responsáveis por padronizar determinadas funções ou componentes em um sistema. São verificadas previamente e continuamente aprimoradas por quem as desenvolveu e mantém.

** API: -> Conjunto de funções que tem uma parte exposta para ser utilizada por outros programas, enquanto mantém o seu conteúdo a sua lógica de implementação encapsulado e escondido de quem vai utilizar. A API é acessada através da WEB e expõe o endereço post/produtos, mas quem utiliza a nossa API, o Front-End ou o Postman ou o Insomnia não sabe o que acontece ali dentro da API, sabe apenas que vai ser cadastrado o produto no banco de dados.

** API: -> Conjunto de rotinas, protocolos e ferramentas para construir aplicações.

Uma API Rest, é uma API WEB que segue o padrão Rest, para ser considerada no tipo Rest, uma API precisa seguir alguns critérios dentre eles estão: 
Uma arquitetura cliente -> Servidor com independência as partes que se comunicam através das requisições http:// , estabelecer uma comunicação extenters (extensores), ou seja uma requisição é independente de qualquer outra requisição pois não carrega onde está. Possuir uma interface uniforme com formato padronizado e recursos identificáveis e manipuláveis pelo cliente.

** API Rest: Em Uma API Rest os recursos são acessados através dos endpoints, quando mapeamos o nosso produto CONTROLLER com p caminho.../bairros estamos definindo que para acessar o recurso bairro da nossa API é preciso utilizar a URL: 

http://localhost:8080/bairro, e aqui tem uma regrinha de ouro para nomenclatura de recursos ele são sempre substantivos, (termo responsál por nomear seres, objetos, ações, lugares, etc),nunca verbos, também definimos que para executar um método cadastrar do recurso produtos é preciso enviar uma requisição para essa URL utilizando o método POST do http://

**Alguns métodos http que podemos utilizar para definir os nossos endpoints são:

POST: Para Cadastrar novos recursos;

PUT: Para Atualizar recursos;

GET: Para Buscar; (**Tipo GET não leva Body**)

DELETE: Para excluir recursos.

Com esses métodos conseguimos fazer um CRUD completo. Lembrando CRUD , vem de: Create, Read, Update e Delete. Ou seja: Cadastrar, Ler, atualizar e excluir. Então agora vamos criar um endpoint de cada:

Um endpoint PUT, um endpoint DELETE e 2 endpoints utilizando o método GET, um para retornar só um Bairro através do Id e o outro para retornar a lista de Bairros, todos os bairros cadastrados na nossa base.


**OBS:.ponto de atenção, uma requisição do tipo GET, não leva Body, para passar parâmetros nessas requisições como o ID do bairro que estamos querendo buscar, podemos utilizar os parâmetros de Query ou os parâmetros de Patch (Patch, significa pacote, o que indicaria mais como um pacote de atualização ou correção.), vamos ver como funciona:

**Vimos que para fazer um CRUD, utilizamos esses métodos http ou POST, PUT, GET e DELETE. Mas no REPOSITORY (Repositoy), que métodos utilizamos para acessar o banco de dados em cada uma dessas letrinhas do CRUD.
Para atualizar uma entidade que é o PUT do CRUD, utilizamos o mesmo método save, que utilizamos no Create (POST). 

Para Buscar temos o:
Firewall(Regras de uma tabela de firewall selecionada lista todas as regras associadas) -> que retorna uma lista com todos os registros da tabela.

Para Excluir temos o:
Delete -> que recebe uma entidade e exclui o registro da base.

Temos também o:
Delete by Id -> que recebe um Id e exclui o registro que possuir esse Id

***VAMOS PARA O CÓGIGO FAZER ESSE CRUD DA NOSSA ENTIDADE BAIRRO (PROJETO AVALIAÇÃO MÓDULO 1)*** 4:32

1. BairroControllers





RequestMapping



  -> public void excluir(Bairro bairro); {    //Recebe um bairro como parâmetro
        repository.delete(bairro);             //Recebe este bairro como parâmetro




XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
_____________________________________


Exercicios_Modulo-1_Back_End
Envio de Exercicios_Modulo-1_Back_End

Modulo1_ProjetoAvaliativo1_Canasvieiras




________________PROJETO README_____________

# Modulo1_ProjetoAvaliativo1
Projeto avaliativo relacionado ao Back-End 

Turma: Canasvieiras
Autor: Marcel Ferreira Campos

Criar a API Rest do LabBeach

Aplicação Desenvolvida para controle das praias de Florianópolis, criando o Back-End de um sistema de praias com os seguintes requisitos:

# Modulo1_ProjetoAvaliativo1_Canasvieiras

Projeto avaliativo relacionado ao Back-End 

Turma: Canasvieiras
Autor: Marcel Ferreira Campos

Criar a API Rest do LabBeach

Aplicação Desenvolvida para controle das praias de Florianópolis, criando o Back-End de um sistema de praias com os seguintes requisitos:

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

//Documentar os endpoint: onde faremos a busca do servido (caminho) -> /:porta/.... ->(exemplo: localhost:8080/caminho
// http://localhost:8080/praias (este é um endpoint para acessar dados de praia e assim sucessivamente para todos os endpoint que serão disponibilizados

_________________







 
 








