package com.example.manoscruzadas.service;

import com.example.manoscruzadas.model.Usuario;
import com.example.manoscruzadas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //listado de todos los usuarios
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    //buscar por id
    public Optional<Usuario> getUsuarioById(Long id){
        return usuarioRepository.findById(id);
    }

    //buscar por email
    public Optional<Usuario> getUsuarioByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    //buscar por nombre, ignorando mayusculas y minusculas
    public Optional<Usuario> getUsuarioByNombre(String nombre){
        return usuarioRepository.findByNombreContainingIgnoreCase(nombre);
    }

    //guardar usuario
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //eliminar usuario
    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
