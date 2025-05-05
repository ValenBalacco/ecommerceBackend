package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Usuario;
import com.example.ecommerceBackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getById(@PathVariable String id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        usuarioService.deleteUsuario(id);
    }
}