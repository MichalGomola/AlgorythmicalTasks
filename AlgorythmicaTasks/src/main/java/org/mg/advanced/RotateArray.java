package org.mg.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * rotate array by 1 (item at index 0 goes as last) using streams
 */


public class RotateArray {

    public static int[] createRotatedArray(final int[] given) {
        List<Integer> rotated = Arrays.stream(given)
                .skip(1)
                .boxed()
                .collect(Collectors.toList());

        rotated.add(given[0]);
        return rotated.stream().mapToInt(Integer::valueOf).toArray();
    }
}
