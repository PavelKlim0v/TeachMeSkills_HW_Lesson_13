package com.teachmeskills.lesson_13.task_1.runner;

import com.teachmeskills.lesson_13.task_1.getdayofweek.DayOfWeek;
import java.util.Date;

/**
 *  Задание 1. (Основное задание)
 *    Получить день недели по дате
 */

public class MainTask_1 {

    public static void main(String[] args) {
        // формат задаваемой даты "год.месяц.число"
        System.out.println(DayOfWeek.getDayOfWeek(new Date(2022,0,31)));
    }

}
