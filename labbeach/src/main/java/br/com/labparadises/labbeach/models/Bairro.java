package br.com.labparadises.labbeach.models;

import jakarta.persistence.*;
import lombok.*;

    /*
    models:É a camada que possui a lógica da aplicação, responsável pelas regras de negócios, persistência com banco de
    dados e as classes de entidades. O models (modelo) recebe as requisições vindas do controller e gera respostas
    a partir destas requisições.
    */

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

@Entity //Representa uma tabela da base de dados,  cada instância da entity corresponde a uma linha da tabela.
@Table(name = "bairros") //Utilizando a anotação para mapeamento do nome da tabela.
public class Bairro {

    //*Id->Informa ao JPA qual campo/atributo da entidade está relacionado à chave primária da tabela no banco de dados.
    @Id

    //*Informa ao provedor de persistência os valores a serem atribuídos ao identificador único.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //*Atributo do Bairro:
    private Long id;
    private String nome;
    private String descricao;
    private Integer populacao;

}
