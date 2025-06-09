package com.example.manoscruzadas.repository;

import com.example.manoscruzadas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    //buscar usuario por email
    Optional<Usuario> findByEmail(String email);

    //buscar usuario por nombre ignorando mayusculas y minusculas
    Optional<Usuario> findByNombreContainingIgnoreCase(String nombre);

    //REFERENCIAS:
    //https://javatute.com/jpa/spring-data-jpa-contains-ignorecase-example/
    //https://www.baeldung.com/spring-data-case-insensitive-queries

}
