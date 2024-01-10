package com.heisje.shlink.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.heisje.shlink.entity.User;
import com.heisje.shlink.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user/signup")
    public ResponseEntity<?> userSignup(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.ok(Map.of("message", "success"));
    }

    @GetMapping("/user/signup")
    public ResponseEntity<?> userSignup(){
        return ResponseEntity.ok(Map.of("message", "success"));

    }
}
