package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Direccion;
import com.example.ecommerceBackend.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public List<Direccion> getAllDirecciones() {
        return direccionRepository.findAll();
    }

    public Optional<Direccion> getDireccionById(Long id) {
        return direccionRepository.findById(id);
    }

    public Direccion saveDireccion(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    public void deleteDireccion(Long id) {
        direccionRepository.deleteById(id);
    }
}