package com.example.Lab_Endexam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request) {

        String token = authService.login(request);

        return new JwtResponse(token);
    }
}