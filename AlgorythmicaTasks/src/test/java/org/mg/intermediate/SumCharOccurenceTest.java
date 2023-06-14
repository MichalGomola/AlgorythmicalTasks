package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumCharOccurenceTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfWorks(String input, String expected) {
        //given and when
        String result = SumCharOccurence.count(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("abc", "1a1b1c"),
                Arguments.of("aabcaa", "2a1b1c2a"),
                Arguments.of("wwwabc", "3w1a1b1c")
        );
    }

}