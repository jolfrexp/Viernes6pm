package com.library.apiLibrary.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    @OneToOne(targetEntity = Libro.class)
    private Libro libro;
}
