package com.distribuida.java.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {
    @GetMapping("/message")
    public String Message() {
        return "Hello, my name is Christian Cueva and this is my API to send the message c: ";
    }
}
