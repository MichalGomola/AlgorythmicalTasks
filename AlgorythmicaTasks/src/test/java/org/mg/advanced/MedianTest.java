package org.mg.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MedianTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfFindsValidMedian(int[] input, double expected) {
        //when
        double result = Median.findMedian(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{6, 4, 2, 4, 4}, 4.0d),
                Arguments.of(new int[]{5,8,-1,6,6,1,10}, 6.0d),
                Arguments.of(new int[]{7,8,3,4,9,2}, 5.5d),
                Arguments.of(new int[]{5, 4, 6, 3, 1, 2}, 3.5d)
        );
    }

}