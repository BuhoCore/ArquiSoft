package com.example.apimvcrest;

import org.springframework.web.bind.annotation.GetMapping;

public class HolaController {
    @GetMapping ( "/Hola")
    public String saludos(){ return "Hola UIA..";}
}
