package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Precio;
import com.example.ecommerceBackend.repository.PrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrecioService {

    @Autowired
    private PrecioRepository precioRepository;

    public List<Precio> getAllPrecios() {
        return precioRepository.findAll();
    }

    public Optional<Precio> getPrecioById(Long id) {
        return precioRepository.findById(id);
    }

    public Precio savePrecio(Precio precio) {
        return precioRepository.save(precio);
    }

    public void deletePrecio(Long id) {
        precioRepository.deleteById(id);
    }
}