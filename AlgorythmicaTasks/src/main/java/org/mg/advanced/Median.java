package org.mg.advanced;

import java.util.Arrays;

/**
 * find median from array
 * */

public class Median {

    public static double findMedian(final int[] given) {

        int[] nums = Arrays.stream(given).sorted().toArray();
        int i = nums.length/2;
        if (nums.length % 2 == 0) {
            return ((double) nums[i-1] + nums[i])/2;
        } else {
            return nums[i];
        }
    }
}
