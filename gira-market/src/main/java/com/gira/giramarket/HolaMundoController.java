package com.gira.giramarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/gira")
public class HolaMundoController {

    @GetMapping("/hola")
    public String index() {
        return "Hola Mundo con Java Spring Boot!";
    }
}
