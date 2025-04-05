package com.library.apiLibrary.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaprestamo;
    private LocalDate fechadevolucion;
    @ManyToOne(targetEntity = Libro.class)
    @JoinColumn(referencedColumnName = "id")
    @JsonBackReference
    private Libro libro;

}
