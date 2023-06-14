package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFactorialIsCountedCorrect1(int input, long expected) {
        //when
        long result = FactorialNum.recursive(input);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFactorialIsCountedCorrect2(int input, long expected) {
        //when
        long result = FactorialNum.imperative(input);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFactorialIsCountedCorrect3(int input, long expected) {
        //when
        long result = FactorialNum.stream(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(3, 6),
                Arguments.of(5, 120),
                Arguments.of(10, 3628800),
                Arguments.of(12, 479001600)
        );
    }

}