package org.mg.advanced;

public class NWD {

    public int findNWD(int first, int second) {
        if (first % second == 0) {
            return second;
        } else {
            return findNWD(second, first % second);
        }
    }
}
