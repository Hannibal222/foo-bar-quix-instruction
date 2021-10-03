package com.kata.foobarquixTest;

import com.kata.fooquixbar.FoobarquixImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoobarquixTest {

    @Test
    public void convert_Number_ToString_Test () {
        
        FoobarquixImpl foobarquix = new FoobarquixImpl();

        Assertions.assertEquals("1", foobarquix.convertNumberToString(1));
        Assertions.assertEquals("FooFoo", foobarquix.convertNumberToString(3));
        Assertions.assertEquals("BarBar", foobarquix.convertNumberToString(5));
        Assertions.assertEquals("Quix", foobarquix.convertNumberToString(7));
        Assertions.assertEquals("Foo", foobarquix.convertNumberToString(9));
        Assertions.assertEquals("FooBar", foobarquix.convertNumberToString(51));
        Assertions.assertEquals("BarFoo", foobarquix.convertNumberToString(53));
        Assertions.assertEquals("FooFooFoo", foobarquix.convertNumberToString(33));
        Assertions.assertEquals("FooQuix", foobarquix.convertNumberToString(27));
        Assertions.assertEquals("FooBarBar", foobarquix.convertNumberToString(15));
    }
}