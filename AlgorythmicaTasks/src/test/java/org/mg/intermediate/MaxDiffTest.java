package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxDiffTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfDifferenceIsCorrect(int[] input, int expected) {
        //when
        int result = MaxDiff.findDiff2(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 4),
                Arguments.of(new int[]{10,7,4,2,1}, -1),
                Arguments.of(new int[]{0,0,0,0,0}, -1),
                Arguments.of(new int[]{1,7,5,6,10}, 9),
                Arguments.of(new int[]{1,7,5,6,7}, 6),
                Arguments.of(new int[]{3,10,2,5,10}, 8),
                Arguments.of(new int[]{3,9,2,5,10}, 8)
        );
    }
}