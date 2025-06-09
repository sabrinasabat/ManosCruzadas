package com.example.manoscruzadas.controller;

import com.example.manoscruzadas.model.Usuario;
import com.example.manoscruzadas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*") //permite el acceso por el frontend
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //listado de todos los usuarios
    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }

    //buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id){
        return usuarioService.getUsuarioById(id)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseEntity.notFound().build());
    }

    //buscar por email
    @GetMapping("/email/{email}")
    public ResponseEntity<Usuario> getUsuarioByEmail(@PathVariable String email){
        return usuarioService.getUsuarioByEmail(email)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseEntity.notFound().build());
    }

    //buscar por nombre, ignorando mayusculas y minusculas
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Usuario> getUsuarioByNombre(@PathVariable String nombre){
        return usuarioService.getUsuarioByNombre(nombre)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseEntity.notFound().build());
    }

    //crear usuario
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    //deletear usuario por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
        if(usuarioService.getUsuarioById(id).isPresent()){
            usuarioService.deleteUsuario(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
