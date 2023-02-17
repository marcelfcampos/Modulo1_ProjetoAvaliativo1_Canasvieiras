package br.com.labparadises.labbeach.models;

import jakarta.persistence.Entity;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode


public class Bairro {

    //Colunas no do banco de dados
    private Long id;    // Id Auto incrementável - JPA gera automáticamente
    private String nome;
    private String descricao;
    private Integer populacao;

}
