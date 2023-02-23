package br.com.labparadises.labbeach.models;


import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode

@Entity
@Table(name = "praias") //Utilizando a anotação para mapeamneto do nome da tabela


public class Praia {

    @Id //Chave primária do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atributos da Praia
    private Long id;
    private String nome;
    private Boolean acessibilidade;
    private String statuspraia;


//    @ManyToOne
//    @JoinColumn(name = "bairro_id")
//    private Praia bairro;


}
