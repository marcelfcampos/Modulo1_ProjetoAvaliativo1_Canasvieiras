package br.com.labparadises.labbeach.controllers;

//Classe BairroControllers -> organiza o endpoint: o endereço onde a API será acessada.

import br.com.labparadises.labbeach.models.Bairro;
import br.com.labparadises.labbeach.services.BairroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    /*
     Controllers: guardam as classes do tipo controllers onde organizam os endpoint, e os endpoint são os endereços onde
     a API será acessada.
     */

@RestController //Anotação de classe
@RequestMapping("/bairros") //Endpoint -> caminho mapeado com String.

public class BairroControllers {

    @Autowired
    BairroServices services; //*Injetar Dependência do services.

    //*Criar Endpoint para chamar o método salvar
    //*Com o Endpoint criado, ele vai receber os dados do bairro para salvar no banco de dados, sendo um Endpoint do tipo post.
    //*Dentro do método cadastrar, vamos chamar o método do service. Para isso, precisamos injetar a dependência do services, utilizando o @Autowired.

    //*Dentro do cadastro pode fazer service.salvar(bairro)
    /*
     Anotação PostMapping,não precisa colocar o caminho porque sempre que receber um Request do tipo Post neste caminho
     bairros, o Spring evoca este método cadastrado.
     */

    /*
    Difinimos de que forma o parâmetro bairro vai chegar pra gente, onde exatamente vai estar na requisição http://
    Para isso adicionamos uma anotação @RequestBody, onde esse valor vai vir no corpo da requisição http://
    */
    @PostMapping  //*@PostMapping: Para cadastrar bairro
    public void cadastrar(@RequestBody Bairro bairro) {
        services.salvar(bairro);
    }


    /*
    @PutMapping -> Chamamos um  Método que utiliza o PUT chamando ele de atualizar, recebendo também um Body contendo
    um bairro que queremos atualizar na nossa base e podemos utilizar o mesmo método de salvar do Service, passando
    o nosso bairro, porque lá dentro do nosso Service ele vai utilizar o save do Repository que é extamente o que também
    utilizamos para atualizar . Com base no id, que será recebido, o Spring Data já vai saber se precisa fazer
    um insert ou um update na base utilizando aquele método save. -> repository.save(bairro); <-
    */
    @PutMapping
    public void atualizar(@RequestBody Bairro bairro) {
        services.salvar(bairro);
    }

    /*
    @DeleteMapping -> O método excluir receberá no Body o bairro que se quer excluir e anotamos este método com @DeleteMapping
    aí precisamos de um novo método no Service:
    -> public void excluir(Bairro bairro) {    //Recebe um bairro como parâmetro.
        repository.delete(bairro);             //Repository também recebe bairro como parâmetro.
     */
    @DeleteMapping
    public void excluir(@RequestBody Bairro bairro) {
        services.excluir(bairro); //-> Método ivocado do Service: services.excluir, passando o bairro que veio da requisição.
    }

    /*
    Faremos agora dois endpoints @GetMapping: se tenho um endpoint Get, retornando uma lista de bairros e vou chamar
    este método de listaTodos não preciso receber nenhum parâmetro por que ele busca todos os produtos da base e
    retornam aqui na lista. Mas para isso preciso de um novo método no Service:

      -> public List<Bairro>buscaTodos() {                  //Retorna uma Lista de Bairro, chamando de buscaTodos
            return (List<Bairro>) repository.findAll();     /Invoca o repository findAll, buscando todos os bairros da base.
        }

         public List<Bairro>buscaTodos() {
        return (List<Bairro>) repository.findAll();
        }
     */
    @GetMapping ("/lista")                  //1ºendpoint Get: Inserimos ("/lista") para diferenciar do 2ºendpoint Get.
    public List<Bairro> listaTodos() {
        return services.buscaTodos();       //Invoca do Services buscaTodos os bairros, e retorna também aqui.

    }
    /*
    O 2ºendpoint Get:Recebe o Id que estou buscando fazendo uma requisição .../bairros/id Retorna um único bairro com
    base no Id, aqui temos 2 endpoint Get, qdo enviarmos uma requisição para ("/bairros") utilizando Get,
     */
    @GetMapping("/{id}")                                    //*2ºendpoint Get.
    public Bairro buscaPorId(@PathVariable Long id) {
        return services.buscaPorId(id);                     //*Método invocado pelo Service.


    }

}

    /*
        ****TERMINAMOS NOSSO CRUD****
        Nossa API contém métodos de:
        * Cadastro
        * Atualização
        * Exclusão
        * Busca por lista ou por um bairro específico

        * Para realizar uma busca que não é atendida por nenhum dos métodos que já tem prontos no Repository,
        podemos criar buscas customizadas dentro do próprio Repository.


    /*
    OBS:.Temos um método que não é chamado para lugar nenhum, temos que transformar em um endpoint, mapear o
    BairroControllers para sempre que a nossa API receber uma requisição no caminho:-> /bairros -> cair dentro de
    BairroControllers, para isso adicionamos a anotação @RequestMapping e colocamos uma String do caminho
    que queremos mapear.
    */

    /*
    OBS:.Para cadastrar um novo bairro na nossa API, precisamos enviar uma nova requisição http do tipo post para a URL:
    http://localhost:8080/bairros, lembrando que localhost é porque a API está sendo rodada localmente na nossa máquina.
    Se fosse em outro servidor seria o domínio para chegar em outro servidor.
    */

    /*
    OBS:.Como fazer uma requisição  http se não há um Front-End, não há um lado cliente para comunicar com este lado
    servidor, com a nossa API. Por esse motivo usamos a ferramenta chamada Postman ou o Insomnia utilizada para testar a
    API, esses nos serviços WEB sem a necessidade de estar rodando um Front-End da Aplicação. Com parâmetros que podemos
    definir.
    */

    /*
    OBS:.Para criar uma API, nós definimos os endpoints nas classes CONTROLLER, que invocam métodos (executar tarefa)
     de uma classe SERVICE, que por sua vez invocam os métodos (executar tarefa) de um REPOSITORY para persistir na base.
    */