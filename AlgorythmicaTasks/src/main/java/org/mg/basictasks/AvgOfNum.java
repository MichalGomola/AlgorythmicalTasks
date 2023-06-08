package org.mg.basictasks;

import java.util.List;
/**
* task for finding average value of numbers with usage of streams
* */
public class AvgOfNum {

    static double streamSolution (final List<Integer> given) {
        return given.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}
