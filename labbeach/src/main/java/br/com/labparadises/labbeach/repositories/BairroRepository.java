package br.com.labparadises.labbeach.repositories;

import br.com.labparadises.labbeach.models.Bairro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Repository: É um padrão de projeto que visa mediar a pesquisa de objetos do domínio entre a camada de mapeamento
de dados, usando uma interface semelhante à de uma coleção, essa camada de domínio filtra a coleção em memória.
*/
@Repository

//Criação do Crud, identificação do tipo da entidade (Bairro)
//Tipo da coluna Id de identificação (Long)
public interface BairroRepository extends CrudRepository<Bairro, Long> {

    @Query(value = "select * from Bairro where ativo = 1",nativeQuery = true)
    List<Bairro> findAllAtivas();

//    @Query(value = "select * from Bairro p WHERE p.descricao = :decricao")
//        public Bairro findbyDescricao(String descricao);


    public List<Bairro> findByNome(String nome);

}

        /*

        ** REALIZANDO BUSCAS CUSTOMIZADAS:

        * Para realizar uma busca que não é atendida por nenhum dos métodos que já tem prontos no Repository,
        podemos criar buscas customizadas dentro do prório Repository.

        Para realizar uma busca customizadas para nossa entidade especificamente, podemos fazer isso criando a assinatura
        desses métodos, pois estamos falando de uma interface que não pode ter corpo do método, podendo ter apenas
        assinatura.
        * Adicionamos uma anotação @Query na assinatura do método, dentro dos parâmetros dessa anotação passamos uma
        String que será a Query que queremos fazer no banco.

        Buscar um produto filtrando pela descrição:

        * Em BairroRepository:

            - Anotação @Query que passa como valor da Query o código SQL que vai buscar isso no banco de dados.
       @Query(value = "SELECT * FROM bairros p WHERE p.descricao = :decricao")      //->Anotação @Query
            public Bairro findbyDescricao(String descraicao);                       //->Esta é a assinatura.
        */

        /*

        ** REALIZANDO BUSCAS SEM ESCREVER A CONSULTA:

        * Em alguns casos não precisa escrever a consulta, temos o derived queries (consultas derivadas) onde escrevemos
        a assinatura do método e o Spring Data consegue identificacr os parâmetros para realizar esse filtro sem
        escrevermos o SQL, a consulta. O Spring data gera a consulta automáticamente só com base no nome e nos parâmetros
        do método.
        Inserimos o nome do atributo que queremos filtrar findByNome, passando um parâmetro chamado nome
        e o  Spring vai gerar esse SELECT, findByNome = o valor do nome
        Definimos:

            public List<Bairro> findByNome(String nome);

            * Com essa declaração de método o Spring Data gera o SELECT para ir no banco de dados buscar essa lista de
            bairros filtrando pelo nome.
        */
