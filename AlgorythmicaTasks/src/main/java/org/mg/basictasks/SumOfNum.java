package org.mg.basictasks;

import java.util.Arrays;

public class SumOfNum {

    public static int sum(final int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
