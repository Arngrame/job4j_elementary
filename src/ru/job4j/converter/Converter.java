package ru.job4j.converter;

public class Converter {

    public int rubleToEuro(int value) {
        if (value < 1) {
            return 0;
        }
        int rsl = value / 70;
        return rsl;
    }

}
