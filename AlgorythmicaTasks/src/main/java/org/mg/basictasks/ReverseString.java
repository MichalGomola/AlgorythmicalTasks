package org.mg.basictasks;

/**
 * reversing string task (all letters are lower case)
 * */
public class ReverseString {

    public static String reverseString(String given) {
        return new StringBuilder(given).reverse().toString();
    }
}
