package com.tareas.gestor.controller;

import com.tareas.gestor.model.Usuario;
import com.tareas.gestor.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> getUsuario() {
        return usuarioService.getAllUsuario();
    }

    @PostMapping("/usuario")
    private void postUsuario(@RequestBody Usuario usuario) { usuarioService.postUsuario(usuario); }

    @PutMapping("/usuario")
    private void updateUsuario(@RequestBody Usuario usuario) { usuarioService.postUsuario(usuario); }

    @DeleteMapping("/usuario/{id}")
    private void deleteUsuario(@PathVariable("id") Long id) { usuarioService.deleteUsuario(id); }

}
