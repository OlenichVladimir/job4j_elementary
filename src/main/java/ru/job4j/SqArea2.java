package ru.job4j;

public class SqArea2 {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double rsl1 = SqArea2.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + rsl1);
        double rsl2 = SqArea2.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + rsl2);
    }
}