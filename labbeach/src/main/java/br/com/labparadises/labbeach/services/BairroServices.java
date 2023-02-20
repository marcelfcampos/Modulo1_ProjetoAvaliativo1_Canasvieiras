package br.com.labparadises.labbeach.services;

import br.com.labparadises.labbeach.models.Bairro;
import br.com.labparadises.labbeach.repositories.BairroRepository;
import org.springframework.stereotype.Service;

///Classe BairroServices -> comportamentos que não se encaixam em outras classes de forma natural e encapsulada.
// Service: Realizado as operações de inserção, deleção, atualização, etc.

//Na camada  de Service importamos um Repository da entidade (Bairro) e evocamos um método (função, subrotina) apartir de uma instância (novo objetodo criado no mesmo tipo da classe) desse repository
//Como fazemos uma instância do (ex: BairroRepository) se o BairroRepository é uma interface.
//Aqui entramos no conceito de injeçao de depenência, que o um designer father ou um padrão de projeto que define que uma classe não pode instanciar um objeto que ela mesmo precisaria instaciar.
//Esse Objeto que ela precisa utilizar, precisa ser fornecido pronto, já instanciado para a classe que irá utilizar ele.
//Spring facilita justamente essa injeção de indepêndencia.


//Classe BairroServices: importar requisito da entidade e invoca método que........

@Service //*Anotação de classe

public class BairroServices {

    //Dentro da nossa classe BairroServices criamos um atributo do tipo Repository (BairroRepository)
    //Desta forma podemos receber uma instancia de Bairro


    private BairroRepository repository; //*Atributo do tipo Repository

    //Receber uma instância de BairroRepository no construtor dessa classe BairroServices e atribuir o nosso atributo
    //Assim podemos utilizar (BairroRepository) nos métodos da classe na sequência

    //Definição de construtor (método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno) de BairroService.



    //*Definimos o construtor: BairroServices recebe BairroRepository e atribui ao this.repository que recebe por parâmetro o repository. Assim injetando a classe BairroRepository dependência a classe BairroServices.
    public BairroServices(BairroRepository repository) {
        this.repository = repository;
    }

    //*Criamos o Método (intrução) Salvar (no banco de dados), que recebe o objeto Bairro e invoca o save do BairroRepository
    public void salvar(Bairro bairro){
        repository.save(bairro);
    }

}
