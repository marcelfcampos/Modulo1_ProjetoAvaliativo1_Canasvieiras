package br.com.labparadises.labbeach.controllers;

//Classe BairroControllers -> organiza o endpoint: o endereço onde a API será acessada.

import br.com.labparadises.labbeach.models.Bairro;
import br.com.labparadises.labbeach.services.BairroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping
    /*
    Difinir de que forma o parâmetro bairro vai chegar pra gente, onde exatamente vai estar na requisição http://
    Para isso adicionamos uma anotação @RequestBody, esse valor vai vir no corpo da requisição http://

     */
    public void cadastrar(@RequestBody Bairro bairro) {
        services.salvar(bairro);


    }


}


    /*
    OBS:.Temos um método que não é chamado para lugar nenhum, temos que transformar em um endpoint, mapear o
    BairroControllers para sempre que a nossa API receber uma requisição no caminho:-> /bairros -> cair dentro de
    BairroControllers, para isso adiciona a anotação @RequestMapping e coloca uma String do caminho que queremos mapear.
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