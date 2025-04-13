package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.HabilidadServicio;
import com.example.manoscruzadas.model.SubCategoria;
import com.example.manoscruzadas.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabilidadServicioRepository extends JpaRepository<HabilidadServicio, Long> {

    //buscar por tipo OFRECE o BUSCA
    List<HabilidadServicio> findByTipo(Tipo tipo);

    //buscar por usuario
    List<HabilidadServicio> findByUsuario_IdUsuario(Long idUsuario);

    //buscar por subcategoria
    List<HabilidadServicio> findBySubCategoria_IdSubcategoria(Long idSubcategoria);

    //buscar por descripcion ignorando mayusculas y minusculas
    List<HabilidadServicio> findByDescripcionContainingIgnoreCase(String descripcion);

}
