package org.mg.basictasks;
/**
 * change string in hex to decimal and decimal to hex
 */
public class HexToDec {

    static String convertFromHexToDec (final String input) {
        return String.valueOf(Long.parseLong(input, 16));
    }

    static String convertFromDecToHex(final Integer input) {
        return Integer.toHexString(input);
    }
}
