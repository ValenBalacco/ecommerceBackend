package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Talle;
import com.example.ecommerceBackend.service.TalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/talles")
public class TalleController {

    @Autowired
    private TalleService talleService;

    @GetMapping
    public List<Talle> getAll() {
        return talleService.getAllTalles();
    }

    @GetMapping("/{id}")
    public Optional<Talle> getById(@PathVariable Long id) {
        return talleService.getTalleById(id);
    }

    @PostMapping
    public Talle save(@RequestBody Talle talle) {
        return talleService.saveTalle(talle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        talleService.deleteTalle(id);
    }
}