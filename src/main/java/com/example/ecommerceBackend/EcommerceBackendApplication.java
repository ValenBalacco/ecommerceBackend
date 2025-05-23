package com.example.ecommerceBackend;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ecommerceBackend.model.enums.Rol;
import com.example.ecommerceBackend.model.Usuario;
import com.example.ecommerceBackend.service.UsuarioService;

@SpringBootApplication
public class EcommerceBackendApplication {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Usuario admin = new Usuario();
		admin.setId("1");
		admin.setNombre("Administrador");
		admin.setEmail("admin@admin.com");
		admin.setContraseña("admin123");
		admin.setRol(Rol.ADMIN);
		usuarioService.saveUsuario(admin);
	}

}
