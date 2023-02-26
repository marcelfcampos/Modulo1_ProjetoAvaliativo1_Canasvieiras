package br.com.labparadises.labbeach.services;

import br.com.labparadises.labbeach.models.Praia;
import br.com.labparadises.labbeach.repositories.PraiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Na camada  de Service precisamos importar um Repository da entidade (Praia)

@Service //Anotação de classe

public class PraiaServices {

    @Autowired  //injeção de dependência do Spring

    //*Atributo do tipo Repository: serve para criar uma instância
    private PraiaRepository repository;

    public PraiaServices(PraiaRepository repository) {this.repository = repository;}

    //*Criamos o Método (intrução) Salvar (no banco de dados), que recebe o objeto praia e invoca o save do praiaRepository
    public void salvar(Praia praia) {
        repository.save(praia);
    }

    /*
    Após o método excluir criado aqui no Service, iremos ao Controllers e invocar:
     */

    public void excluir(Praia praia) {      //recebe praia como parâmetro.
        repository.delete(praia);           //repository também recebe praia como parâmetro.
    }

    public List<Praia>buscaTodos() {                 //Retorna uma Lista de prias, chamando de buscaTodos
        return (List<Praia>) repository.findAll();  //Invoca o repository findAll, buscando todos as praias da base.
    }
    /*
    Este método findById não retorna exatamente uma praia, irá retorna um optional de uma praia que é  um tipo de classe
    que trata um problema que temos com null no java, como ele vem como optional, precisamos extrair um valor da praia
    de dentro desse optional, invocando o método get dentro do optional para retornar a praia que vem nesse get
   */
    public Praia buscarPorId(Long id) {
        return repository.findById(id).get();
    }


}
