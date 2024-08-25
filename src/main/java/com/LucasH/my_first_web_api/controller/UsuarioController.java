package com.LucasH.my_first_web_api.controller;

import com.LucasH.my_first_web_api.Model.Usuario;
import com.LucasH.my_first_web_api.UsuarioRepository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping()
    public List<Usuario> getUsuarios() {
       return usuarioRepository.findAll();
    }
@GetMapping("/{username}")
    public Usuario getUsuario(@PathVariable("username") String username) {
        return usuarioRepository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioRepository.deleteById(id);
    }
    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
