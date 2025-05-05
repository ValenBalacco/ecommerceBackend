package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Talle;
import com.example.ecommerceBackend.repository.TalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TalleService {

    @Autowired
    private TalleRepository talleRepository;

    public List<Talle> getAllTalles() {
        return talleRepository.findAll();
    }

    public Optional<Talle> getTalleById(Long id) {
        return talleRepository.findById(id);
    }

    public Talle saveTalle(Talle talle) {
        return talleRepository.save(talle);
    }

    public void deleteTalle(Long id) {
        talleRepository.deleteById(id);
    }
}