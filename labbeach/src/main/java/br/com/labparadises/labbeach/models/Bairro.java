package br.com.labparadises.labbeach.models;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

@Entity //Representa uma tabela da base de dados,  cada instância da entity corresponde a uma linha da tabela.
@Table(name = "bairros") //Utilizando a anotação para mapeamento do nome da tabela.
public class Bairro {

    //Atributos da Praia
    @Id //Informa ao JPA qual campo/atributo da entidade está relacionado à chave primária da tabela no banco de dados.

    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa ao provedor de persistência os valores a serem atribuídos ao identificador único.
    private Long id;
    private String nome;
    private String descricao;
    private Integer populacao;

}
