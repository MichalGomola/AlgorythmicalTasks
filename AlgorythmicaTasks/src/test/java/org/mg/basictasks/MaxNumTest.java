package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void maxNum(int[] given, int expected) {
        //when
        int result = MaxNum.maxNum(given);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{5, 5}, 5),
                Arguments.of(new int[]{5, 4}, 5),
                Arguments.of(new int[]{5,4,6,3,7,2}, 7)
        );
    }

}