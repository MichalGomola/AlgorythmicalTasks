package org.mg.advanced;

public class Palindrome {

    public static boolean checkIfPalindrome(String given) {
        return given.contentEquals(new StringBuilder(given).reverse());
    }
}
