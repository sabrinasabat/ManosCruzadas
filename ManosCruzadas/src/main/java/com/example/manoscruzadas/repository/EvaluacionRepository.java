package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {

    //buscar evaluaciones hechas por un usuario - el evaluador
    List<Evaluacion> findByEvaluador_IdUsuario(Long idEvaluador);

    //buscar evaluaciones recibidas por un usuario - el evaluado
    List<Evaluacion> findByEvaluado_IdUsuario(Long idEvaluado);

}
