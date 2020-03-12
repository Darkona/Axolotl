package com.darkona.axolotl.service.impl;

import com.darkona.axolotl.model.Greeting;
import com.darkona.axolotl.service.GreetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Slf4j
public class GreetServiceImpl implements GreetService {

    private final AtomicLong counter = new AtomicLong();
    private static final String TEMPLATE = "Hello %s! I'm Axolotl!";


    public Greeting createGreeting(String name){
        log.info(String.format("%s greeted on %s",name,new Date().toString() ));
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

}
