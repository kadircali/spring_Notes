package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {


    public CricketCoach() {
        System.out.println("in constuctor"+getClass().getSimpleName());
    }


    //define init

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("in doMyStartUpStuff"+getClass().getSimpleName());
    }

    //define destroy
    @PreDestroy
    public void doMyCelanupStuff(){
        System.out.println("in doMyCleanupStuff"+getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
        return "prative fast bowling for 15 mins!";
    }
}