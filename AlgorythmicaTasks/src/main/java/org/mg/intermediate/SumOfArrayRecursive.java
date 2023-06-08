package org.mg.intermediate;

import java.util.Arrays;

public class SumOfArrayRecursive {

    public static int sum(int[] given) {
        if (given.length == 0) {
            return 0;
        }
        if (given.length == 1) {
            return given[0];
        }

        return given[0] + sum(Arrays.copyOfRange(given, 1, given.length));
    }
}
