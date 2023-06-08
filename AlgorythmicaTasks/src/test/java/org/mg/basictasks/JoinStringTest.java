package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JoinStringTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void joinStrings(List<String> input, String expected) {
        //when
        String result = JoinString.joinStr(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(List.of("a"), "a"),
                Arguments.of(List.of("a", "b"), "ab"),
                Arguments.of(List.of("a", "b", "c"), "abc"),
                Arguments.of(List.of("a", "b", "c", "d"), "abcd"),
                Arguments.of(List.of("a","b","c","d","e","f"), "abcdef"),
                Arguments.of(List.of("a","b","c","d","e","f","g","h"), "abcdefgh")
        );
    }
}