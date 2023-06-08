package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void reverseStringTest(String input, String expected) {
        //given
        String result = ReverseString.reverseString(input);

        //then
        assertEquals(expected, result);
    }

    public static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("q", "q"),
                Arguments.of("qu", "uq"),
                Arguments.of("qua", "auq"),
                Arguments.of("quac", "cauq"),
                Arguments.of("quack", "kcauq"),
                Arguments.of("aibohphobia", "aibohphobia")
        );
    }

}