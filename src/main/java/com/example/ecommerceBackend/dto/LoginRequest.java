package com.example.ecommerceBackend.dto;

public class LoginRequest {
    private String email;
    private String contraseña;

    // Getters y setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
}
