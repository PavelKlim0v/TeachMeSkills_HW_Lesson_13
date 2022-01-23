package com.teachmeskills.lesson_13.task_3.factorialorinverse;

public class FactorialOrInverse {

    // в параметре может быть передано целочисленное значение(и если ввести 2, то можно узнать факториал)
    // в параметре может быть передана строка(и если ввести 1, то можно развернуть строку)
    public static <T> Object factorialOrInverse(String enterValue,T intOrStr) {
        // реверс строки
        if (enterValue.startsWith("1")) {
            IGenericFunctionalInterface<String> iGenFuncStr = (str) -> {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result += str.charAt(i);
                }
                return result;
            };

            return iGenFuncStr.func((String)intOrStr);

            // вычисляем факториал числа
        } else if (enterValue.startsWith("2")) {
            int forLambdaExpression_n = Integer.parseInt(enterValue);
            IGenericFunctionalInterface<Integer> iGenFuncInt = (n) -> {
                int result = 1;
                for (int i = 1; i < n; i++) {
                    result *= i;
                }
                return result;
            };

            return iGenFuncInt.func((Integer) intOrStr);

        } else {
            System.out.println("Попробуйте ввести 1 или 2.");
        }

        return null;
    }

}
