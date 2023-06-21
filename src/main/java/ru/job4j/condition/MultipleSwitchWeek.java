package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Пн", "Mon" -> 1;
            case "Вт", "Tue" -> 2;
            case "Ср", "Wed" -> 3;
            case "Чт", "Thu" -> 4;
            case "Пт", "Fri" -> 5;
            case "Сб", "Sat" -> 6;
            case "Вс", "Sun" -> 7;
            default -> -1;
        };
    }
}