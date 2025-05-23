package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.OrdenCompra;
import com.example.ecommerceBackend.service.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordenes")
public class OrdenCompraController {

    @Autowired
    private OrdenCompraService ordenService;

    @GetMapping
    public List<OrdenCompra> getAll() {
        return ordenService.getAllOrdenes();
    }

    @GetMapping("/{id}")
    public Optional<OrdenCompra> getById(@PathVariable Long id) {
        return ordenService.getOrdenById(id);
    }

    @PostMapping
    public OrdenCompra save(@RequestBody OrdenCompra orden) {
        return ordenService.saveOrden(orden);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ordenService.deleteOrden(id);
    }

    @PutMapping("/{id}")
    public OrdenCompra update(@PathVariable Long id, @RequestBody OrdenCompra orden) {
        orden.setId(id);
        return ordenService.saveOrden(orden);
    }
}