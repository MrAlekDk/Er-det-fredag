package com.example.demo.services;

import java.util.Calendar;

public class DayOfTheWeek {


    public boolean isItFriday() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == 6) {
            return true;
        } else {
            return false;
        }

    }
}
