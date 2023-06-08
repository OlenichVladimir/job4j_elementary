package ru.job4j;

public class Point {
    public static double distance(double x2, double x1, double y2, double y1) {
        double x = (Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
        return x;
    }

    public static void main(String[] args) {
        double result = distance(12, 3, 9, 6);
        System.out.println("result (3, 6) to (9, 12) " + Math.sqrt(result));
    }
}