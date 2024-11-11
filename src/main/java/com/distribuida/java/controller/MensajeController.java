package com.distribuida.java.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {
    @GetMapping("/mensaje")
    public String Mensaje() {
        return "Aqui estamos Probando la Api en Java con Spring boot c: ";
    }
}
