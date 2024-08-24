package com.LucasH.my_first_web_api.controller;

import com.LucasH.my_first_web_api.Model.Usuario;
import com.LucasH.my_first_web_api.UsuarioRepository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/users")
    public List<Usuario> getUsuarios() {
       return usuarioRepository.findAll();
    }
}
