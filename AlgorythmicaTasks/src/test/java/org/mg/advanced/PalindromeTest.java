package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfWorks(String input) {
        //when
        boolean result = Palindrome.checkIfPalindrome(input);

        //then
        assertTrue(result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("i"),
                Arguments.of("ii"),
                Arguments.of("mim"),
                Arguments.of("madamimadam"),
                Arguments.of("aibohphobia")
        );
    }

}