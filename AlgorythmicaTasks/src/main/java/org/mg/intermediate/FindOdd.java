package org.mg.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {

    private FindOdd(){}

    public static List<Integer> findOddNumbers(final List<String> given) {
        return prepareValidList(given).stream()
                .filter(n -> n%2 == 1)
                .collect(Collectors.toList());
    }

    private static List<Integer> prepareValidList(List<String> given) {
        List<Integer> result = new ArrayList<>();
        for (String s :
                given) {
            try {
                result.add(Integer.valueOf(s));
            } catch(NumberFormatException e) {
                System.out.println("error message");
            }
        }
        return result;
    }
}
