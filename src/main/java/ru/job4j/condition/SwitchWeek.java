package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Пн";
                break;
            case 2:
                name = "Вт";
                break;
            case 3:
                name = "Ср";
                break;
            case 4:
                name = "Чт";
                break;
            case 5:
                name = "Среда";
                break;
            case 6:
                name = "Сб";
                break;
            case 7:
                name = "Вс";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }
}