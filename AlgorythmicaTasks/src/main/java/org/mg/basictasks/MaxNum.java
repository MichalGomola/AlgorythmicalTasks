package org.mg.basictasks;

import java.util.Arrays;


/**
 * finding max in integer Array
 */
public class MaxNum {

    static int maxNum(final int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }
}
