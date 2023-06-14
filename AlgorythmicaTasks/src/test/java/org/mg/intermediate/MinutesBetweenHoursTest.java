package org.mg.intermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinutesBetweenHoursTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void checkIfWorks(String input, long expected){
        //given and when
        long result = MinutesBetweenHours.calc(input);

        //then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("6:55PM-12:00AM", 305),
                Arguments.of("12:00AM-11:59PM", 1439),
                Arguments.of("12:00AM-12:00AM", 0),
                Arguments.of("12:30PM-11:30AM", 1380),
                Arguments.of("12:00AM-12:30PM", 750),
                Arguments.of("11:30AM-12:14PM", 44)
        );
    }
}