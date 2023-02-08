package com.gurujava.apiRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @RequestMapping(value = "teste")
    public String test() {
        return "ola mundo";
    }
}
