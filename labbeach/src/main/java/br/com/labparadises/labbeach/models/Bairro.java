package br.com.labparadises.labbeach.models;

import jakarta.persistence.*;
import lombok.*;

//@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

@Entity
@Table(name = "bairros")
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer populacao;

}
