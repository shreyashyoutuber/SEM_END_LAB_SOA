package com.example.Lab_Endexam;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtService jwtService;

    public AuthService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String login(LoginRequest request) {

        if ("admin".equals(request.getUsername())
                && "1234".equals(request.getPassword())) {

            return jwtService.generateToken(request.getUsername());
        }

        throw new RuntimeException("Invalid username or password");
    }
}