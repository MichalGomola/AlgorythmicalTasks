package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfAnagram(String firstW, String secondW, boolean expected) {
        //when
        boolean result = Anagram.checkIfAnagram(firstW, secondW);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("","", true),
                Arguments.of("ELVIS","LIVES", true),
                Arguments.of("FUNERAL","REALFUN", true),
                Arguments.of("ELEVEN PLUS TWO","TWELVE PLUS ONE", true),
                Arguments.of("TOMMARVOLORIDDLE", "IAMLORDVOLDEMORT", true),
                Arguments.of("1","", false),
                Arguments.of("","1", false),
                Arguments.of("a","aa", false),
                Arguments.of("bb","b", false),
                Arguments.of("ELEVEN PLUS TWO","TWELVE PLUS ONEE", false),
                Arguments.of("ELEVEN PLUS TWWO","TWELVE PLUS ONE", false)
        );
    }

}