package com.javanauta.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // Aponta que é uma tabela do banco de dados
@Table(name = "telefone") // Indica o nome da tabela
@Builder


public class Telefone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "numero", length = 19)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;
}
