package br.com.labparadises.labbeach.services;

import br.com.labparadises.labbeach.models.Bairro;
import br.com.labparadises.labbeach.repositories.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    /*
    Services: É a camada intermediária entre Controllers e Repository e realiza algum processamento adicional caso seja
    necessário. Ela tem comportamentos que não se encaixam em outras classes de forma natural e encapsulada. Realizando
    operações de inserção, deleção, atualização, etc.
    */

    /*
    Na camada  de Services importamos o Repository da entidade (Bairro) e invocamos o método desejado apartir de uma
    instância desse repository.
    Significado de instância -> objeto novo criado no mesmo tipo da classe)
    */

    /*
    Como fazemos uma instância no (BairroRepository) se o BairroRepository é uma interface, aqui entra o conceito
    de injeçao de depedência, que o  designer father ou um padrão de projeto  define que uma classe jamais vai
    instânciar um objeto que ela mesma precisa utilizar. Esse Objeto precisa ser fornecido pronto, já instanciado
    para a classe que irá utilizar ele. E o Spring facilita justamente essa injeção de depêndencia.
    */



@Service //*Anotação de classe,

    /*
    Dentro da nossa classe BairroServices criamos um atributo do tipo BairroRepository, recebendo uma instância de
    BairroRepository no construtor desta classe BairroServices e atribuir ao  nosso atributo para utilizarmos ele
    nos métodos da classe na seguencia.
     */
public class BairroServices {

    @Autowired    //injeção de dependência do Spring

    //*Atributo do tipo Repository: serve para criar uma instância
    private BairroRepository repository;

    //Construtor-> método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno de BairroService.

    /*
    Construtor de BairroServices: BairroServices recebe BairroRepository e atribui ao this.repository que recebe por
    parâmetro. Assim injetando essa dependência na nossa classe BairroServices, não precisando instânciar um
    BairroRepository. Estamos recebendo ele pronto e injetando no nosso atributo.
    */

    public BairroServices(BairroRepository repository) {
        this.repository = repository;
    }

    //*Criamos o Método (intrução) Salvar (no banco de dados), que recebe o objeto Bairro e invoca o save do BairroRepository
    public void salvar(Bairro bairro){
        repository.save(bairro);
    }
    /*
    Após o método excluir criado aqui no Service, iremos ao Controllers e invocar:

     */
    public void excluir(Bairro bairro) {    //recebe bairro como parâmetro.
        repository.delete(bairro);          //repository também recebe bairro como parâmetro.
    }

    public List<Bairro>buscaTodos() {                   //Retorna uma Lista de Bairro, chamando de buscaTodos
        return (List<Bairro>) repository.findAll();     //Invoca o repository findAll, buscando todos os bairros da base.
    }

    /*
    Este método findById não retorna exatamente um bairro, irá retorna um optional de um bairro que é  um tipo de classe
    que trata um problema que temos com null no java, como ele vem como optional, precisamos extrair um valor do bairro
    de dentro desse optional, invocando o método get dentro do optional para retornar o bairro que vem nesse get
     */
    public Bairro buscaPorId(Long id) {
        return repository.findById(id).get();
    }

}

