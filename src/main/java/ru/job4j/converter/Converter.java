package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float in2 = 120;
        float expected = 2;
        float out1 = rubleToEuro(in1);
        float out2 = rubleToDollar(in2);
        boolean passed1 = expected == out1;
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
    }
}