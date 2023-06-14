package org.mg.intermediate;

import java.util.ArrayList;
import java.util.List;
/**
 * find max in list with recursion
 * */
public class FindMaxInList {

    public static int recursive(List<Integer> given) {
        if (given.isEmpty()) {
            return 0;
        }

        if (given.size() == 1) {
            return given.get(0);
        }

        List<Integer> forRecursion = new ArrayList<>(given);
        if (forRecursion.get(0) > forRecursion.get(1)) {
            forRecursion.remove(1);
        } else {
            forRecursion.remove(0);
        }

        return recursive(forRecursion);
    }
}
