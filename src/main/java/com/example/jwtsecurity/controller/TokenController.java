package com.example.jwtsecurity.controller;

import com.example.jwtsecurity.model.JwtUser;
import com.example.jwtsecurity.security.JwtTokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtTokenGenerator jwtTokenGenerator;

    @Autowired
    public TokenController(JwtTokenGenerator jwtTokenGenerator) {
        this.jwtTokenGenerator = jwtTokenGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        return jwtTokenGenerator.generate(jwtUser);
    }

}
