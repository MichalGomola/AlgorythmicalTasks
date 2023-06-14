package org.mg.advanced;

/**
 * find greatest common divisor using recursion
 * */

public class NWD {

    public int findNWD(int first, int second) {
        if (first % second == 0) {
            return second;
        } else {
            return findNWD(second, first % second);
        }
    }
}
