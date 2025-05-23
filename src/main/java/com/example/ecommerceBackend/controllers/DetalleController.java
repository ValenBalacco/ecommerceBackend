package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Detalle;
import com.example.ecommerceBackend.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalles")
public class DetalleController {

    @Autowired
    private DetalleService detalleService;

    @GetMapping
    public List<Detalle> getAll() {
        return detalleService.getAllDetalles();
    }

    @GetMapping("/{id}")
    public Optional<Detalle> getById(@PathVariable Long id) {
        return detalleService.getDetalleById(id);
    }

    @PostMapping
    public Detalle save(@RequestBody Detalle detalle) {
        return detalleService.saveDetalle(detalle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        detalleService.deleteDetalle(id);
    }

    @PutMapping("/{id}")
    public Detalle update(@PathVariable Long id, @RequestBody Detalle detalle) {
        detalle.setId(id);
        return detalleService.saveDetalle(detalle);
    }
}