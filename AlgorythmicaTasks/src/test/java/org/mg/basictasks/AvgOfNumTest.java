package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AvgOfNumTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void streamSolution (List<Integer> input, double expected) {
        //when
        double result = AvgOfNum.streamSolution(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(List.of(5), 5.0d),
                Arguments.of(List.of(5, 4), 4.5d),
                Arguments.of(List.of(5, 4, 6), 5.0d),
                Arguments.of(List.of(5, 4, 6, 3), 4.5d),
                Arguments.of(List.of(5,4,6,3,7,2), 4.5d)
        );
    }
}