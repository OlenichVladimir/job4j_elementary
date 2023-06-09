package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea1 = "I like Java!";
        String idea2 = " But I am a newbie. ";
        int year = 2023;
        idea1 += idea2;
        System.out.println(idea1 + year);
    }
}