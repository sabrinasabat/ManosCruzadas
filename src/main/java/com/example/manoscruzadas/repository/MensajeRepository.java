package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

    //buscar mensajes enviadas por un usuario especifico
    List<Mensaje> findByUsuarioRemitente_IdUsuario(Long idUsuarioRemitente);

    //buscar mensajes recibidos por un usuario especifico
    List<Mensaje> findByUsuarioDestinatario_IdUsuario(Long idUsuarioDestinatario);

    //buscar mensajes de un match especifico
    List<Mensaje> findByMatch_IdMatch(Long idMatch);
}
