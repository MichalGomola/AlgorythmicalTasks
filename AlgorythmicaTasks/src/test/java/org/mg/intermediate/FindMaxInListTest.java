package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxInListTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfMaxisFoundCorrectly(List<Integer> input, int expected) {
        //when
        int result = FindMaxInList.recursive(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(Collections.emptyList(), 0),
                Arguments.of(List.of(5), 5),
                Arguments.of(List.of(1, 2, 3, 4, 5), 5),
                Arguments.of(List.of(6, 6, 6, 6, 6), 6),
                Arguments.of(List.of(0, 0, 0, 0, 0), 0),
                Arguments.of(List.of(Integer.MIN_VALUE, -44_555, -34, -10, -50), -10),
                Arguments.of(List.of(-10_000, 50, 10_001), 10_001),
                Arguments.of(List.of(Integer.MIN_VALUE, 0, Integer.MAX_VALUE), Integer.MAX_VALUE)
        );
    }

}