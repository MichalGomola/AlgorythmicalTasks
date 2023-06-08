package org.mg.advanced;

import java.util.Arrays;

/**
 * find if second word is anagram of the firs one (all small or all big cases)
 * */
public class Anagram {

    public static boolean checkIfAnagram(final String firstWord, final String secondWord) {
        String s1 = firstWord.trim();
        String s2 = secondWord.trim();

        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] s1array = s1.toCharArray();
            char[] s2array = s2.toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);

            return Arrays.equals(s1array, s2array);
        }
    }
}
