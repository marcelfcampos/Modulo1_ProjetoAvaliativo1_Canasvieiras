package br.com.labparadises.labbeach.models;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

@Entity
@Table(name = "bairros") //Utilizando a anotação para mapeamento do nome da tabela
public class Bairro {

    //Atributos da Praia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer populacao;

}
