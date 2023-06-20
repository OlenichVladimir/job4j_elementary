package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Это число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Число делится на 3, но это не четное число.";
        } else if (number % 2 == 0) {
            rsl = "Это число не делится на 3, но это четное число.";
        } else {
            rsl = "Это число не делится на 3, и это не четное число.";
        }
        return rsl;
    }
}