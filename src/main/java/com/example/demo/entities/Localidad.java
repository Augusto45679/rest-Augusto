package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.*;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}
