package com.tareas.gestor.service;

import com.tareas.gestor.model.Usuario;
import com.tareas.gestor.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuario() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());
        return usuarios;
    }

    public void getByIdUsuario() {

    }

    public void postUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario()  {
    }

    public void deleteUsuario(Long id) { usuarioRepository.deleteById(id); }
}
