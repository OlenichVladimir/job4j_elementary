package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 2;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}