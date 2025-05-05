package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Descuento;
import com.example.ecommerceBackend.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/descuentos")
public class DescuentoController {

    @Autowired
    private DescuentoService descuentoService;

    @GetMapping
    public List<Descuento> getAll() {
        return descuentoService.getAllDescuentos();
    }

    @GetMapping("/{id}")
    public Optional<Descuento> getById(@PathVariable Long id) {
        return descuentoService.getDescuentoById(id);
    }

    @PostMapping
    public Descuento save(@RequestBody Descuento descuento) {
        return descuentoService.saveDescuento(descuento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        descuentoService.deleteDescuento(id);
    }
}