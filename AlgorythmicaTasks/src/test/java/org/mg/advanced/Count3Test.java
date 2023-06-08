package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Count3Test {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfAll3AreCounted(String given, int expected) {
        //when
        int result = Count3.countAll3(given);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfAll3AreCountedStream(String given, int expected) {
        //when
        int result = Count3.countAll3Stream(given);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("0", 0),
                Arguments.of("3", 1),
                Arguments.of("00", 0),
                Arguments.of("33", 2),
                Arguments.of("030", 1),
                Arguments.of("303", 2),
                Arguments.of("3030303", 4)
        );

    }

}