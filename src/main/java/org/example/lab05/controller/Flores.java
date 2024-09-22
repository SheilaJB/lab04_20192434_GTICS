package org.example.lab05.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flores")
public class Flores {


    //Inicio
    @GetMapping("/inicio")
    public String inicio() {
        return "index";
    }
    @GetMapping("/catalogo")
    public String showCatalogo() {
        return "/Catalogo/catalogo-lista";
    }
    @GetMapping("/entretenimiento")
    public String showEntretenimiento() {
        return "/Entretenimiento/entretenimiento-lista";
    }
    @GetMapping("/carrito")
    public String showCarrito() {
        return "/Carrito/carrito-lista";
    }

}
