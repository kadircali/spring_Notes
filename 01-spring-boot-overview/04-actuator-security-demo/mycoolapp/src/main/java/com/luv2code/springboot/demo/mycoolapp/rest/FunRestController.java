package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${coach.name}")
    private String coachname ;

    @GetMapping("/")
    public String sayHello(){
        return  "hello java world" + coachname;

    }

    //another andpoint
    @GetMapping("/workout")
    public String work(){
        return  "work 3 hours a day";
    }
}
