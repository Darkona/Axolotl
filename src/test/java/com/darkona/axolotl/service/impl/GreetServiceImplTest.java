package com.darkona.axolotl.service.impl;

import com.darkona.axolotl.model.Greeting;
import com.darkona.axolotl.service.GreetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetServiceImplTest {


    @Autowired
    GreetService greetService;

    @Test
    void createGreeting() {

        Greeting greeting = greetService.createGreeting("Pangolin");
        assertEquals(1, greeting.getId(), "First greeting is 1");
        assertThat(greeting.getMessage()).containsSequence("Pangolin");

        greeting = greetService.createGreeting("Kangaroo");
        assertEquals(2, greeting.getId(), "Next greeting is 2");

        greetService.createGreeting("Wombat");
        greetService.createGreeting("Koala");
        greeting = greetService.createGreeting("Ocelot");

        assertEquals(5, greeting.getId(), "Greeting is incrementing");
    }


}