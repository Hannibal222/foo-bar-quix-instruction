package com.kata.fooquixbar;

import java.util.stream.Stream;

public class FoobarquixImpl implements FooBarQuix {

    @Override
    public String convertNumberToString (Integer number) {
        if (number == 1) {
            return "1";
        }

        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) {
            sb.append("Foo");
        }
        if (number % 5 == 0) {
            sb.append("Bar");
        }
        Stream.of(number.toString().split("")).forEach(n -> {
            if (Integer.valueOf(n) == 3) {
                sb.append("Foo");
            }
            if (Integer.valueOf(n) == 5) {
                sb.append("Bar");
            }
            if (Integer.valueOf(n) == 7) {
                sb.append("Quix");
            }
        });
        return sb.toString();
    }
}