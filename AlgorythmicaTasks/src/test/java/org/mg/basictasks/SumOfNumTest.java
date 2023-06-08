package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void sumTest(int[] input, int expected) {
        //when
        int result = SumOfNum.sum(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{5,4}, 9),
                Arguments.of(new int[]{5,4,6}, 15),
                Arguments.of(new int[]{5,4,6,3}, 18),
                Arguments.of(new int[]{5,4,6,3,7,2}, 27)
        );
    }

}