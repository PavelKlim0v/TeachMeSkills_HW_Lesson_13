package com.teachmeskills.lesson_13.task_3.runner;

import com.teachmeskills.lesson_13.task_3.factorialorinverse.FactorialOrInverse;
import java.util.Scanner;

/**
 *  Задание 3. (Основное задание)
 *    Создать обобщенный функциональный интерфейс.
 *    1) Написать класс с одним методом (подумать и аргмументировать решение о том будет ли это статический методо или нет).
 *    2) В этом методе реализуйте логику:
 * 	     - если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса
 * 	       логику реверса строки(вывода строки в обратном порядке).
 * 	     - если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в
 * 	       метод интерфейса логику нахождения факториала числа.
 */

public class MainTask_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 или 2: ");
        String enterValue = scan.nextLine();     // неполучится узнать факториал у строки(пример строки: abc)

        if (enterValue.equals("1")){
            System.out.print("Введите любое слово: ");
            String str1 = scan.nextLine();
            Object obj1 = FactorialOrInverse.factorialOrInverse(enterValue, str1);
            System.out.println("Реверс строки: "+ obj1);

        } else if (enterValue.equals("2")){
            System.out.print("Введите любое число: ");
            int num1 = scan.nextInt();
            Object obj2 = FactorialOrInverse.factorialOrInverse(enterValue, num1);
            System.out.println("Факториал числа = "+ obj2 );
        }

        scan.close();
    }

}
