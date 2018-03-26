package com.daehosting.temperatureconversions;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));

        assertEquals(32,result.intValue());
    }
}
