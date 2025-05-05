package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Direccion;
import com.example.ecommerceBackend.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/direcciones")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @GetMapping
    public List<Direccion> getAll() {
        return direccionService.getAllDirecciones();
    }

    @GetMapping("/{id}")
    public Optional<Direccion> getById(@PathVariable Long id) {
        return direccionService.getDireccionById(id);
    }

    @PostMapping
    public Direccion save(@RequestBody Direccion direccion) {
        return direccionService.saveDireccion(direccion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        direccionService.deleteDireccion(id);
    }
}
