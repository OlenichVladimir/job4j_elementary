package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}, rsl = new int[100];
        int j = money - price, size = 0;
        for (int i : coins) {
            while (j >= i) {
                rsl[size++] = i;
                j -= i;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}