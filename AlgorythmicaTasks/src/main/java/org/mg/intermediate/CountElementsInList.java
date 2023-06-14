package org.mg.intermediate;

import java.util.List;

/**
 * function counting elements in list with use of recursion
 * */
public class CountElementsInList {

    public static <E> int count(List<E> given) {
        if (given.isEmpty()) return 0;

        given.remove(0);
        return count(given) + 1;
    }
}
