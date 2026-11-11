package br.edu.unisal.cadastro_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api")
public class HelloController {

    public record Saudacao(String mensagem) {}

    @GetMapping("/hello")
    public String hello() {
        return "Olá, Spring Boot!";
    }

    @GetMapping("/saudacao")
    public Saudacao saudacao() {
        return new Saudacao("Olá, Turma");
    }

}