package com.darkona.axolotl.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class HomeController {

    @GetMapping(
            value = "/",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public ResponseEntity<byte[]> axolotl() throws IOException {

        //Random picture because i can
        String axolotlPic = 0.5d < Math.random() ? "axolotl.jpg" : "axolotl2.jpg";

        ClassPathResource imgFile = new ClassPathResource("static/" + axolotlPic);
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(StreamUtils.copyToByteArray(imgFile.getInputStream()));
    }


}
