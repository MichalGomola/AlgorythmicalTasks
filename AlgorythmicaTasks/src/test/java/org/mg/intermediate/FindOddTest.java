package org.mg.intermediate;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindOddTest {

    @Test
    void checkIfWorks() {
        //given
        List<String> list1 = List.of("dupa", "1",  "2" ,"5");
        List<String> list2 = List.of("1", "2", "3", "5");

        //when
        List<Integer> result1 = FindOdd.findOddNumbers(list1);
        List<Integer> result2 = FindOdd.findOddNumbers(list2);

        //then
        assertEquals(2, result1.size());
        assertEquals(3, result2.size());
    }

}