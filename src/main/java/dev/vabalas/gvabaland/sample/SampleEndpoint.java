package dev.vabalas.gvabaland.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class SampleEndpoint {

    @GetMapping
    public String helloWorld() {
        return "It do work";
    }
}
