package org.mg.advanced;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * count all '3' in given string
 * */
public class Count3 {

    public static int countAll3(final String given) {
        String without3 = given.replace("3","");
        return given.length() - without3.length();
    }

    public static int countAll3Stream(final String given) {
        return (int) given.chars()
                .mapToObj(n -> (char) n)
                .filter(n -> n.equals('3'))
                .count();
    }
}
