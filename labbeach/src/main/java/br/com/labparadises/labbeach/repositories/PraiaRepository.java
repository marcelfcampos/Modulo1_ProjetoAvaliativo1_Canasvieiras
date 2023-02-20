package br.com.labparadises.labbeach.repositories;

import br.com.labparadises.labbeach.models.Praia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotação de classe

//Criação do Crud, identificação do tipo da entidade (Praia)
//Tipo da coluna Id de identificação (Long)

public interface PraiaRepository extends CrudRepository<Praia, Long> {
}
