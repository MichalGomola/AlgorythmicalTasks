package org.mg.advanced;

import java.util.Arrays;

public class SumOfEvenNumbers {

    public static int sumEven(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n%2==0)
                .sum();
    }
}
