package org.mg.advanced;


/**
 * find if string is palindrome
 * */

public class Palindrome {

    public static boolean checkIfPalindrome(String given) {
        return given.contentEquals(new StringBuilder(given).reverse());
    }
}
