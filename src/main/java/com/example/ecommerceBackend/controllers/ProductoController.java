package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Producto;
import com.example.ecommerceBackend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getById(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.saveProducto(producto);
    }
}