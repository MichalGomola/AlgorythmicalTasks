package org.mg.advanced;

import java.util.Arrays;

/**
 * find second amx number in given array
 */

public class SecondMax {

    public static int findSecondMax(int[] given) {
        final int[] nums = Arrays.stream(given)
                .sorted()
                .distinct()
                .toArray();
        int secondMaxIndex = nums.length -2;
        return nums.length > 1 ? nums[secondMaxIndex] : 0;
    }
}
