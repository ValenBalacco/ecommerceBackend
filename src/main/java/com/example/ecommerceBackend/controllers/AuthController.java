package com.example.ecommerceBackend.controllers;
import com.example.ecommerceBackend.service.AuthService;
import com.example.ecommerceBackend.dto.LoginRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequest loginRequest) {
        System.out.println("Intento de login recibido");
        String email = loginRequest.getEmail();
        String contraseña = loginRequest.getContraseña();
        return authService.login(email, contraseña);
    }
}
