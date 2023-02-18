package br.com.labparadises.labbeach.repositories;

import br.com.labparadises.labbeach.models.Bairro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

//Criação do Crud, identificação do tipo da entidade (Bairro)
//Tipo da coluna Id de identificação (Long)
public interface BairroRepository extends CrudRepository<Bairro, Long> {


}
