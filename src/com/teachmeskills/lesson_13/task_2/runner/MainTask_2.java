package com.teachmeskills.lesson_13.task_2.runner;

import com.teachmeskills.lesson_13.task_2.datenextuesday.DateNextTuesday;
import java.util.Date;

/**
 *  Задание 2. (Основное задание)
 *    Получить дату следеющего вторника
 */

public class MainTask_2 {

    public static void main(String[] args) {
        // формат получаемой даты "День недели  число.меяц.год"
        System.out.println(DateNextTuesday.getDateNextTuesday(new Date()));
    }

}
