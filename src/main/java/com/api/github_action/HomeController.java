package com.api.github_action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "¡Hola! Pipeline CI/CD funcionando correctamente ";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
