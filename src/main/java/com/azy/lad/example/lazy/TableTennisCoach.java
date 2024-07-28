package com.azy.lad.example.lazy;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach{
    public TableTennisCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "TT means table tennis";
    }
}
