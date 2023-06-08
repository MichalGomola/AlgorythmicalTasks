package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibbTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFibbNumIsValid(int input, long expected) {
        //when
        long result = Fibb.findFibb(input);

        //then
        assertEquals(expected, result);
    }

    public static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(0,0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(7, 13),
                Arguments.of(46, 1836311903),
                Arguments.of(47, 2971215073L)
        );
    }

}