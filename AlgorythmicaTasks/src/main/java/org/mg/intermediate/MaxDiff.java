package org.mg.intermediate;
/**
 * find max difference between items in array, considering that smaller number has to have smaller index
 * */
public class MaxDiff {

    public static int findDiff(int[] given) {
        int firstIndex = 0;
        int secondIndex = 0;
        int maxDiff = 0;

        for (int i = 0; i < given.length; i++) {
            if (given[i] < given[firstIndex]) {
                firstIndex = i;
                secondIndex = i;
            }

            secondIndex = given[secondIndex] > given[i] ? secondIndex : i;

            int currentDiff = given[firstIndex] - given[secondIndex];

            maxDiff = Math.max(maxDiff, currentDiff);
        }

        return maxDiff == 0 ? -1 : maxDiff;
    }

    public static int findDiff2(int[] given) {
        int maxDiff = 0;

        for (int i = 1; i < given.length; i++) {
            for (int j = 0; j < i-1; j++) {
                int currentDiff = given[i] - given[j];
                maxDiff = Math.max(maxDiff, currentDiff);
            }
        }

        return maxDiff == 0 ? -1 : maxDiff;
    }
}
