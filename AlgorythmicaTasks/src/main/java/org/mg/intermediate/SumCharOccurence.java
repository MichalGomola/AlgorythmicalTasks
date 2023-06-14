package org.mg.intermediate;


/**
 * return char occurence line in example
 * aaabbbcc -> 3a3b2c
 * */

public class SumCharOccurence {

    public static String count(final String str) {
        StringBuilder result = new StringBuilder();
        String[] letters = str.split("");
        int counter = 0;
        String letter = letters[0];

        for (String s: letters) {
            if (letter.equals(s)) {
                counter++;
            } else {
                result.append(counter).append(letter);
                counter = 1;
                letter = s;
            }
        }
        result.append(counter).append(letter);

        return result.toString();
    }
}
