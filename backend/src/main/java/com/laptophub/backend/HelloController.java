package com.laptophub.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/status")
    public String checkStatus() {
        return "Servidor de LaptopHub funcionando correctamente y conectado a Neon!";
    }
}