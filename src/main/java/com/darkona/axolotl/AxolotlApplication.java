package com.darkona.axolotl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AxolotlApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(AxolotlApplication.class, args);
    }

    //Esto hace falta para que Spring utilice la autoconfiguración a través del ApplicationBuilder
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(AxolotlApplication.class);
    }

}
