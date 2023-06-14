package org.mg.basictasks;

import java.util.Arrays;

/**
 * find sum of numbers in array using stream
 * */

public class SumOfNum {

    public static int sum(final int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
