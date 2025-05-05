package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.ItemOrden;
import com.example.ecommerceBackend.service.ItemOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items-orden")
public class ItemOrdenController {

    @Autowired
    private ItemOrdenService itemOrdenService;

    @GetMapping
    public List<ItemOrden> getAll() {
        return itemOrdenService.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<ItemOrden> getById(@PathVariable Long id) {
        return itemOrdenService.getItemById(id);
    }

    @PostMapping
    public ItemOrden save(@RequestBody ItemOrden item) {
        return itemOrdenService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemOrdenService.deleteItem(id);
    }
}