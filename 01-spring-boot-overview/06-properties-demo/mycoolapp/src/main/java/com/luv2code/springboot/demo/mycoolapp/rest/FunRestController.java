package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //property injection
    @Value("${coach.name}")
    private String coachname ;

    @Value("${team.name}")
    private String teamName;


    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public  String teamInfo(){
        return "team coach:"+coachname+" team name:"+teamName ;
    }


    @GetMapping("/")
    public String sayHello(){
        return  "hello java world" ;

    }

    //another andpoint
    @GetMapping("/workout")
    public String work(){
        return  "work 3 hours a day";
    }
}
