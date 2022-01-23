package com.teachmeskills.lesson_13.task_2.datenextuesday;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateNextTuesday {

    public static String getDateNextTuesday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int d = calendar.get(Calendar.DAY_OF_WEEK);

        if (d == 1) calendar.add(Calendar.DAY_OF_WEEK, 2);
        if (d == 2) calendar.add(Calendar.DAY_OF_WEEK, 1);
        if (d == 3) calendar.add(Calendar.DAY_OF_WEEK, 7);
        if (d == 4) calendar.add(Calendar.DAY_OF_WEEK, 6);
        if (d == 5) calendar.add(Calendar.DAY_OF_WEEK, 5);
        if (d == 6) calendar.add(Calendar.DAY_OF_WEEK, 4);
        if (d == 7) calendar.add(Calendar.DAY_OF_WEEK, 3);

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy");

        return "Следующий вторниу будет: "+ formatForDateNow.format(calendar.getTime());
    }

}
