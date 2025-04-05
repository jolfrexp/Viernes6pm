package com.library.apiLibrary.controladores;

import com.library.apiLibrary.modelos.Libro;
import com.library.apiLibrary.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    @Autowired
    LibroServicio libroServicio;

    // EndPoint para crear un Libro
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro){
        return libroServicio.saveLibro(libro);
    }

    @GetMapping
    public List<Libro> getAllLibros(){
        return libroServicio.getAlllibros();
    }
    

}
