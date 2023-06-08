package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindFirst3Test {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfWorks(int[] input, int expected) {
        //when
        int result = FindFirst3.findIndexOf3(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[0], -1),
                Arguments.of(new int[]{5}, -1),
                Arguments.of(new int[]{3}, 0),
                Arguments.of(new int[]{3, 5}, 0),
                Arguments.of(new int[]{5, 3}, 1),
                Arguments.of(new int[]{5,4,6,3,7,2}, 3)
        );
    }

}