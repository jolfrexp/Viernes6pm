package com.library.apiLibrary.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity // Define esta clase como una entidad (tabla en la BD)
//@Table(name="libros")
public class Libro {
    @Id // primary key en la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="bookid")
    private Long id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(name="autor", nullable = false, length = 50)
    private String autor;
    private LocalDate fechacompra;
    // Relación uno a uno con la entidad de Reparacion
    @OneToOne(targetEntity = Reparacion.class)
    private Reparacion reparacion; // un objeto para libro reparado
    @OneToMany(targetEntity = Prestamo.class, fetch = FetchType.LAZY, mappedBy = "libro")
    @JsonManagedReference //varios (serializar y deserializar)
    private List<Prestamo> prestamo;

}
