package ru.job4j;

import ru.job4j.converter.Converter;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        int rubles = 5000;
        System.out.println(converter.rubleToEuro(rubles));
    }

}
