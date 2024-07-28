package com.azy.lad.example.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class BadmintonCoach implements Coach{
    public BadmintonCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is badminton Coach";
    }
}
