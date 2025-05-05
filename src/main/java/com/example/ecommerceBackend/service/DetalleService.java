package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Detalle;
import com.example.ecommerceBackend.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    public List<Detalle> getAllDetalles() {
        return detalleRepository.findAll();
    }

    public Optional<Detalle> getDetalleById(Long id) {
        return detalleRepository.findById(id);
    }

    public Detalle saveDetalle(Detalle detalle) {
        return detalleRepository.save(detalle);
    }

    public void deleteDetalle(Long id) {
        detalleRepository.deleteById(id);
    }
}