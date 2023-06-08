package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatedNumbersTest {

    @ParameterizedTest
    @MethodSource("testArgumentsProvider")
    void checkIfFindsDuplicatedNum(String[] given, int expected) {
        //when
        int result = DuplicatedNumbers.findDuplicated(given);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentsProvider() {
        return Stream.of(
                Arguments.of(new String[0], 0),
                Arguments.of(new String[]{"1"}, 0),
                Arguments.of(new String[]{"1", "2"}, 0),
                Arguments.of(new String[]{"1", "1"}, 1),
                Arguments.of(new String[]{"5","4","6","3","5","2"}, 5)
        );
    }
}