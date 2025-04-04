package com.library.apiLibrary.repositorios;

import com.library.apiLibrary.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
