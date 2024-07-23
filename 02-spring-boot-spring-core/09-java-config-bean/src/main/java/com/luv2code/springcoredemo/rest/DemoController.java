package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency
    private Coach myCoach ;


    //define a consturctor for dependency injection

    //hepsi aynı bean'e referans edecek:singleton
    //porototype ile hepsi farklı nesneye referans verir
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach coach){
        System.out.println("in constuctor"+getClass().getSimpleName());
        myCoach  = coach ;

    }


    @GetMapping("/workout")
    public  String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
