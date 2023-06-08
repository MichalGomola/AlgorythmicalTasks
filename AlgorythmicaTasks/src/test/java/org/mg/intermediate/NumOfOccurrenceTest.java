package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumOfOccurrenceTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfWorks(int givenOccu, int[] input, List<Integer> expected) {
        //when
        List<Integer> result = NumOfOccurrence.findNumbs(givenOccu, input);

        //then
        assertTrue(expected.equals(result));
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(2, new int[]{-5, -5,-2,-1,-1,0,1,1,1,2,2,3}, List.of(-5,-1,2)),
                Arguments.of(1, new int[]{-4,-3,-3,0,1,1,1,2,3,5,5,5}, List.of(-4, 0, 2, 3))
        );
    }
}