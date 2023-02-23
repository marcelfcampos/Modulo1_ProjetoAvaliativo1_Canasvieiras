package br.com.labparadises.labbeach.models;

import jakarta.persistence.*;
import lombok.*;

    /*
    models:É a camada que possui a lógica da aplicação, responsável pelas regras de negócios, persistência com banco de
    dados e as classes de entidades. O models (modelo) recebe as requisições vindas do controller e gera respostas
    a partir destas requisições.
    */

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

    //*Entity: Representa uma tabela da base de dados,  cada instância da entity corresponde a uma linha da tabela.
@Entity

    /*
    Table: passa pelo parâmetro name, qual é o nome da tabela, caso o nome da tabela seja diferente do nome da classe
    podemos utilizar o mapeamento "string" para renomear o nome da table.
    */
@Table(name = "bairros") //*Mapeamento do nome da tabela
public class Bairro {

    //*Id->Informa ao JPA qual campo/atributo da entidade está relacionado à chave primária da tabela no banco de dados.
    @Id

    //*Informa ao provedor de persistência os valores a serem atribuídos ao identificador único.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /*
    Atributo: equivalentes as colunas do banco de dados, os tipos acabam sendo muito parecidos:
        varchar: se trata de string; int é int, etc....
        Caso algum atributo tenha um nome diferente da coluna do banco de dados, podemos usar a anotação:
        @colunn(nome da coluna)
     */

    //*Atributo das colunas da tabela bairros:
    private Long id;

    private String nome;
    private String descricao;
    private Integer populacao;


    @ManyToOne
    @JoinColumn(name = "praia_id")
    private Bairro bairro;

}
