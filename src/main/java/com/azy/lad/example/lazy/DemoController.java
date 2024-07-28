package com.azy.lad.example.lazy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach mycoach;

    public DemoController(@Qualifier("cricketCoach") Coach coach){
        mycoach = coach;
    }

    @GetMapping("/coach")
    public String fetchCoach(){
        return mycoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String sayHello(){
        return "The code is working....";
    }
}
