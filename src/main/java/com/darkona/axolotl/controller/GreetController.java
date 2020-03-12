package com.darkona.axolotl.controller;

import com.darkona.axolotl.model.Greeting;
import com.darkona.axolotl.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetService;

    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting salute(@RequestParam(value = "name", defaultValue = "World") String name) {

        return greetService.createGreeting(name);
    }
}
