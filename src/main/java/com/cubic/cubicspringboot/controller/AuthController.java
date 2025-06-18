package com.cubic.cubicspringboot.controller;

import com.cubic.cubicspringboot.model.AuthRequest;
import com.cubic.cubicspringboot.model.AuthResponse;
import com.cubic.cubicspringboot.model.User;
import com.cubic.cubicspringboot.service.JwtService;
import com.cubic.cubicspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/token")
    public ResponseEntity<?> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(authRequest.getUsername());
            User user = userService.getUserByUsername(authRequest.getUsername());
            return ResponseEntity.ok(new AuthResponse(token, user));
        } else {
            throw new UsernameNotFoundException("Invalid username or password");
        }
    }
}
