package org.mg.advanced;

import java.util.Arrays;

/**
 * find index of first occurence of 3 using streams, if no 3 then give -1
 * */
public class FindFirst3 {

    public static int findIndexOf3(final int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .toList()
                .indexOf(3);
    }
}
