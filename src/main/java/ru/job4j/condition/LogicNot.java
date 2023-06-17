package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenIsPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) && notPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl = isEven(2);
        boolean rsl1 = isPositive(1);
        boolean rsl2 = notEven(1);
        boolean rsl3 = notPositive(-1);
        boolean rsl4 = notEvenIsPositive(1);
        boolean rsl5 = evenOrNotPositive(-2);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);
    }
}