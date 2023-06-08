package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NWDTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFindsValidNWD(int input1, int input2, int expected) {
        //when
        int result =new NWD().findNWD(input1, input2);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(1, 2, 1),
                Arguments.of(2, 3, 1),
                Arguments.of(2, 4, 2),
                Arguments.of(12, 8, 4),
                Arguments.of(282, 78, 6),
                Arguments.of(78, 282, 6),
                Arguments.of(28, 4628, 4),
                Arguments.of(4628, 28, 4),
                Arguments.of(1836311903, 1134903170, 1),
                Arguments.of(1134903170, 1836311903, 1)
        );
    }
}