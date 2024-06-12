package com.cofebreak.portfoliospringbackend.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/portfolio")
    public ResponseEntity<String> getHolaMundoJson() {
        return new ResponseEntity<>("HOLA MUNDO", HttpStatus.INTERNAL_SERVER_ERROR);
    }


}