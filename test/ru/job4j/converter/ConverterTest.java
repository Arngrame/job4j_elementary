package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

    private Converter converter;

    @Before
    public void init () {
        converter = new Converter();
    }

    @Test
    public void positiveConvertRubleToEuroTest () {
        Assert.assertEquals(converter.rubleToEuro(5000), 71);
    }

    @Test
    public void negativeConvertRubleToEuroTest () {
        Assert.assertNotEquals(converter.rubleToEuro(5000), 200);
    }

}
