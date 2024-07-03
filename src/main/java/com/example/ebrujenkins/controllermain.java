package com.example.ebrujenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class controllermain {


    @GetMapping
    public String deneme(){

        return "ebru_denemeler ebruuuumalatyaaazkul ";
    }
}
