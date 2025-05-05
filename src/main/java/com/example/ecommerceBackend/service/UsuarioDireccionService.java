package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.UsuarioDireccion;
import com.example.ecommerceBackend.repository.UsuarioDireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioDireccionService {

    @Autowired
    private UsuarioDireccionRepository usuarioDireccionRepository;

    public List<UsuarioDireccion> getAllUsuarioDirecciones() {
        return usuarioDireccionRepository.findAll();
    }

    public Optional<UsuarioDireccion> getById(Long id) {
        return usuarioDireccionRepository.findById(id);
    }

    public UsuarioDireccion save(UsuarioDireccion ud) {
        return usuarioDireccionRepository.save(ud);
    }

    public void delete(Long id) {
        usuarioDireccionRepository.deleteById(id);
    }
}