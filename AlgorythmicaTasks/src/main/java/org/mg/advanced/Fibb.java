package org.mg.advanced;
/**
 * finding n fibb number with recursion
 * */
public class Fibb {

    public static long findFibb(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return findFibb(num-1) + findFibb(num-2);
        }
    }
}
