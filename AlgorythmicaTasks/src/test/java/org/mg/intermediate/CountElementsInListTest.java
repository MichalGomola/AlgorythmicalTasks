package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountElementsInListTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    <E> void checkIfCountedCorrectly(List<E> input, int expected) {
        //when
        int result = CountElementsInList.count(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Collections.emptyList()), 0),
                Arguments.of(new ArrayList<>(List.of(1)), 1),
                Arguments.of(new ArrayList<>(List.of(1, 2)), 2),
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 5),
                Arguments.of(new ArrayList<>(IntStream.rangeClosed(1, 100).boxed().toList()), 100)
        );
    }

}