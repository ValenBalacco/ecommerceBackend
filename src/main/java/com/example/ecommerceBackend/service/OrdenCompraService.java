package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.OrdenCompra;
import com.example.ecommerceBackend.model.ItemOrden;
import com.example.ecommerceBackend.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenCompraService {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    public List<OrdenCompra> getAllOrdenes() {
        return ordenCompraRepository.findAll();
    }

    public Optional<OrdenCompra> getOrdenById(Long id) {
        return ordenCompraRepository.findById(id);
    }

    public OrdenCompra saveOrden(OrdenCompra orden) {
        if (orden.getItems() != null) {
            for (ItemOrden item : orden.getItems()) {
                item.setOrdenCompra(orden);
            }
        }
        return ordenCompraRepository.save(orden);
    }

    public void deleteOrden(Long id) {
        ordenCompraRepository.deleteById(id);
    }
}