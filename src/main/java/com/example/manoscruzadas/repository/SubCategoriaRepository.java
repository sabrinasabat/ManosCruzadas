package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.SubCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoriaRepository extends JpaRepository<SubCategoria, Long> {

    //buscar subcategoria por nombre ignorando mayusculas y minusculas
    List<SubCategoria> findByNombreContainingIgnoreCase(String nombre);

    //buscar subcategoria de una categoria especifica
    List<SubCategoria> findByCategoria_IdCategoria(Long idCategoria);

    //REFERENCIA:
    //https://danielme.com/2023/03/05/curso-spring-data-jpa-consultas_derivadas-derived_queries-repositorios_asincronos/#los-fundamentos-de-las-consultas-derivadas
}
