package org.mg.intermediate;

import java.util.stream.IntStream;

public class FactorialNum {

    public static long recursive(int given) {
        return given == 0 || given == 1 ? 1 : given * recursive(given-1);
    }

    public static long imperative(int given) {
        if (given == 0 || given == 1) {return 1;}

        long result = 1;
        for (int i = given; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static long stream(int given) {
        return given == 0 || given == 1 ? 1 : IntStream.rangeClosed(1, given).reduce(1, (a,b) -> a*b);
    }
}
