package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SecondMaxTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfSecondMaxIsCorrect(int[] input, int expected) {
        //when
        int result = SecondMax.findSecondMax(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{5}, 0),
                Arguments.of(new int[]{5, 5}, 0),
                Arguments.of(new int[]{5, 4}, 4),
                Arguments.of(new int[]{5, 4, 6, 3, 7, 2}, 6),
                Arguments.of(new int[]{472, 135, 834, 714, 534}, 714)
        );
    }

}