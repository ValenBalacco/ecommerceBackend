package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.ItemOrden;
import com.example.ecommerceBackend.repository.ItemOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemOrdenService {

    @Autowired
    private ItemOrdenRepository itemOrdenRepository;

    public List<ItemOrden> getAllItems() {
        return itemOrdenRepository.findAll();
    }

    public Optional<ItemOrden> getItemById(Long id) {
        return itemOrdenRepository.findById(id);
    }

    public ItemOrden saveItem(ItemOrden item) {
        return itemOrdenRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemOrdenRepository.deleteById(id);
    }
}