package org.mg.basictasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class HexToDecTest {

    @ParameterizedTest
    @MethodSource("testArgumentProvider")
    void hexToDec(String input, String expected) {
        //when
        String result = HexToDec.convertFromHexToDec(input);

        //then
        assertEquals(result, expected);
    }


    private static Stream<Arguments> testArgumentProvider() {
        return Stream.of(
                Arguments.of("0", "0"),
                Arguments.of("F", "15"),
                Arguments.of("10", "16"),
                Arguments.of("20", "32"),
                Arguments.of("B00B5", "721077"),
                Arguments.of("CAFEBABE", "3405691582"),
                Arguments.of("DEADBEEF", "3735928559")
        );
    }

}