package org.mg.intermediate;

import java.util.*;

public class NumOfOccurrence {

    public static List<Integer> findNumbs(int numberOfOccurrence, int[] given) {
        Set<Integer> keySet = new HashSet<>();
        Collections.addAll(keySet, Arrays.stream(given).boxed().toArray(Integer[]::new));

        return keySet.stream()
                .filter(k -> findOccu(k, given) == numberOfOccurrence)
                .sorted()
                .toList();
    }

    private static int findOccu(int k, int[] given) {
        return (int) Arrays.stream(given)
                .boxed()
                .filter(n -> n == k)
                .count();
    }
}
