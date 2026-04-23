package com.example.demo.presentation;

import com.example.demo.application.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    private final SaludoService service = new SaludoService();

    @GetMapping("/saludo")
    public String saludo() {
        return service.obtenerSaludo();
    }
}
