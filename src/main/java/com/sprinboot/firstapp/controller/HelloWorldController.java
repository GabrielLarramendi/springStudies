package com.sprinboot.firstapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Faz com que a classe seja um controlador
@ResponseBody //Converte objeto em JSON
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return  "Hello world!";
    }

}
