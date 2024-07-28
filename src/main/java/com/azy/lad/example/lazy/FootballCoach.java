package com.azy.lad.example.lazy;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public FootballCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Football la la alalal";
    }
}
