package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Descuento;
import com.example.ecommerceBackend.repository.DescuentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescuentoService {

    @Autowired
    private DescuentoRepository descuentoRepository;

    public List<Descuento> getAllDescuentos() {
        return descuentoRepository.findAll();
    }

    public Optional<Descuento> getDescuentoById(Long id) {
        return descuentoRepository.findById(id);
    }

    public Descuento saveDescuento(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    public void deleteDescuento(Long id) {
        descuentoRepository.deleteById(id);
    }
}