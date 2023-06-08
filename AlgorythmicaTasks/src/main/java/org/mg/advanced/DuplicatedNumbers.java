package org.mg.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * find first duplicated numbers in String[] and return it
 * */
public class DuplicatedNumbers {

    public static int findDuplicated(final String[] nums) {
        List<Integer> numList = Arrays.stream(nums)
                .map(Integer::valueOf)
                .sorted()
                .toList();

        for (int i = 0; i < numList.size() - 1; i++) {
            if (Objects.equals(numList.get(i), numList.get(i + 1))) {
                return numList.get(i);
            }
        }
        return 0;
    }
}
