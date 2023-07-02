package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (target == array[i] + array[j]) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}