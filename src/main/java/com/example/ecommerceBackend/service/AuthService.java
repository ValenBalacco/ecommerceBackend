package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.config.JwtUtil;
import com.example.ecommerceBackend.model.Usuario;
import com.example.ecommerceBackend.model.enums.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JwtUtil jwtUtil;

    public Map<String, String> login(String email, String contraseña) {
        Optional<Usuario> usuarioOpt = usuarioService.getAllUsuarios().stream()
                .filter(u -> u.getEmail().equals(email)
                        && u.getContraseña().equals(contraseña)
                        && u.getRol() == Rol.ADMIN)
                .findFirst();

        Map<String, String> response = new HashMap<>();
        if (usuarioOpt.isPresent()) {
            String token = jwtUtil.generateToken(usuarioOpt.get().getEmail());
            response.put("token", token);
            response.put("usuario", usuarioOpt.get().getNombre());
        } else {
            response.put("error", "Credenciales inválidas o no autorizado");
        }
        return response;
    }
}
