package br.com.labparadises.labbeach.repositories;

import br.com.labparadises.labbeach.models.Bairro;
import br.com.labparadises.labbeach.models.Praia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Anotação de classe

//Criação do Crud, identificação do tipo da entidade (Praia)
//Tipo da coluna Id de identificação (Long)

public interface PraiaRepository extends CrudRepository<Praia, Long> {

//        @Query(value = "select * from Praia where ativo = 1",nativeQuery = true)
//        List<Praia> findAllAtivas();

//    @Query(value = "select * from Praia p WHERE p.descricao = :decricao")
//    public Praia findbyDescricao(String descricao);
}





    //public List<Praia> findByNome(String nome);



//    @Query(value = "select * from Bairro p WHERE p.descricao = :decricao")
//        public Bairro findbyDescricao(String descricao);