package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Precio;
import com.example.ecommerceBackend.service.PrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/precios")
public class PrecioController {

    @Autowired
    private PrecioService precioService;

    @GetMapping
    public List<Precio> getAll() {
        return precioService.getAllPrecios();
    }

    @GetMapping("/{id}")
    public Optional<Precio> getById(@PathVariable Long id) {
        return precioService.getPrecioById(id);
    }

    @PostMapping
    public Precio save(@RequestBody Precio precio) {
        return precioService.savePrecio(precio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        precioService.deletePrecio(id);
    }
}