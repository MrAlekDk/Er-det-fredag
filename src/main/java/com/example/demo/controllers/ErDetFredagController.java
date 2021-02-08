package com.example.demo.controllers;


import com.example.demo.services.DayOfTheWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErDetFredagController {

    private DayOfTheWeek dayToday;

@ResponseBody
@GetMapping("IsItFriday")
public String isItFriday(){
    dayToday = new DayOfTheWeek();

    if(dayToday.isItFriday()==true){
        return "Yes, it's friday, woohooo!";
    }
    else{
        return "Sadly, it is not friday :(";
    }

}

}
