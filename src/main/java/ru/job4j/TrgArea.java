package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s = Math.sqrt((0.5 * (a + b + c) * (0.5 * (a + b + c) - a) * (0.5 * (a + b + c) - b) * (0.5 * (a + b + c) - c)));
        return s;
    }

        public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}