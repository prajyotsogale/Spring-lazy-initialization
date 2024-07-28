package com.azy.lad.example.lazy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "ee vedya ye bat ka grip nikalke teri ....";
    }
}
