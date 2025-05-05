package com.example.ecommerceBackend.repository;

import com.example.ecommerceBackend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
