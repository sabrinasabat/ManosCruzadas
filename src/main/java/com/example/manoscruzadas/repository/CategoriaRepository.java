package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    //buscar categorías por nombre:
    List<Categoria> findByNombreContainingIgnoreCase(String nombre);
}
