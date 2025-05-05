package com.example.ecommerceBackend.repository;

import com.example.ecommerceBackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
