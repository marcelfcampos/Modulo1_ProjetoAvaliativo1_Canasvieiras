package br.com.labparadises.labbeach.repositories;

import br.com.labparadises.labbeach.models.Bairro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    /*
    Repository: É um padrão de projeto que visa mediar a pesquisa de objetos do domínio entre a camada de mapeamento
    de dados, usando uma interface semelhante à de uma coleção, essa camada de domínio filtra a coleção em memória.
    */
@Repository

//Criação do Crud, identificação do tipo da entidade (Bairro)
//Tipo da coluna Id de identificação (Long)
public interface BairroRepository extends CrudRepository<Bairro, Long> {


}
