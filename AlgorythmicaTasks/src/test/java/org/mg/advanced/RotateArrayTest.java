package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfRotatedCorrectly(int[] input, int[] expected) {
        //when
        int[] result = RotateArray.createRotatedArray(input);

        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{5}, new int[]{5}),
                Arguments.of(new int[]{5,4}, new int[]{4,5}),
                Arguments.of(new int[]{5,4,6}, new int[]{4,6,5}),
                Arguments.of(new int[]{1,2,3,4,5,6}, new int[]{2,3,4,5,6,1})
        );
    }
}