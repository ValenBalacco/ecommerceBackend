package com.example.ecommerceBackend.controllers;

import com.example.ecommerceBackend.model.Img;
import com.example.ecommerceBackend.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imagenes")
public class ImgController {

    @Autowired
    private ImgService imgService;

    @GetMapping
    public List<Img> getAll() {
        return imgService.getAllImgs();
    }

    @GetMapping("/{id}")
    public Optional<Img> getById(@PathVariable Long id) {
        return imgService.getImgById(id);
    }

    @PostMapping
    public Img save(@RequestBody Img img) {
        return imgService.saveImg(img);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        imgService.deleteImg(id);
    }
}