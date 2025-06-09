package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.EstadoMatch;
import com.example.manoscruzadas.model.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchesRepository extends JpaRepository<Matches, Long> {

    //buscar matches con usuario1
    List<Matches> findByUsuario1_IdUsuario(Long idUsuario1);

    //buscar matches con usuario2
    List<Matches> findByUsuario2_IdUsuario(Long idUsuario2);

    //buscar matches por status PENDIENTE, ACEPTO, RECHAZADO
    List<Matches> findByStatus(EstadoMatch status);

    //buscar matches entre 2 usuarios especificos (independiente del orden)
    List<Matches> findByUsuario1_IdUsuarioAndUsuario2_IdUsuario(Long idUsuario1, Long idUsuario2);

    //REFERENCIAS:
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.named-parameters
    //https://danielme.com/2024/04/17/spring-data-jpa-derived-queries/
}
