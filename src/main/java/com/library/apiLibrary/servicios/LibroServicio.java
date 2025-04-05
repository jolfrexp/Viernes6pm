package com.library.apiLibrary.servicios;

import com.library.apiLibrary.modelos.Libro;
import com.library.apiLibrary.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    // Inyectar el repositorio de Libro
    @Autowired
    private LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    // Métodos para el crud
    // Crear un libro
    public Libro saveLibro(Libro libro){
        return libroRepositorio.save(libro);
    }
    public List<Libro> getAlllibros(){
        return libroRepositorio.findAll();
    }
}
