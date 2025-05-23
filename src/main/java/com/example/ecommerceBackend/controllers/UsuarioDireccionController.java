package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.UsuarioDireccion;
import com.example.ecommerceBackend.service.UsuarioDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario-direcciones")
public class UsuarioDireccionController {

    @Autowired
    private UsuarioDireccionService service;

    @GetMapping
    public List<UsuarioDireccion> getAll() {
        return service.getAllUsuarioDirecciones();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioDireccion> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public UsuarioDireccion save(@RequestBody UsuarioDireccion usuarioDireccion) {
        return service.save(usuarioDireccion);
    }

    @PutMapping("/{id}")
    public UsuarioDireccion update(@PathVariable Long id, @RequestBody UsuarioDireccion usuarioDireccion) {
        usuarioDireccion.setId(id);
        return service.save(usuarioDireccion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}