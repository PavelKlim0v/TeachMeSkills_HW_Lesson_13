package com.teachmeskills.lesson_13.task_1.getdayofweek;

import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {

    public static String getDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String a = "";
        int d = cal.get(Calendar.DAY_OF_WEEK);

        if (d == 1) a = "Saturday";
        if (d == 2) a = "Sunday";
        if (d == 3) a = "Monday";
        if (d == 4) a = "Tuesday";
        if (d == 5) a = "Wednesday";
        if (d == 6) a = "Thursday";
        if (d == 7) a = "Friday";

        return a;
    }
}
