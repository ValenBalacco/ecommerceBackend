package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Categoria;
import com.example.ecommerceBackend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaService.getAllCategorias();
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }
}