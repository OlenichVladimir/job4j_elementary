package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMult(double first, double second) {
        return summ(first, second)
                + mult(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double summFull(double first, double second) {
        return summ(first, second)
                + diff(first, second)
                + mult(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMult(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDiv(10, 20));
        System.out.println("Сумма всех четырех операций " + summFull(10, 20));
    }
}