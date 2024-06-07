package org.example;

import org.junit.jupiter.api.Test;

import static org.example.StringManipulator.reverseString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseTextTest(){
        // GIVEN
        final String input = "alma";

        // WHEN
        String result = reverseString(input);

        // THEN
        assertThat(result, is(equalTo("amla")));
    }

    @Test
    void reverseStringNullInputTest(){
        //GIVEN
        final String input = null;
        //WHEN

        //THEN
        assertThrows(NullStringException.class, () -> reverseString(input));
    }

    @Test
    void reverseStringSpaceOnlyInputTest(){
        //GIVEN
        final String input = "   ";
        //WHEN

        //THEN
        assertThrows(SpaceOnlyException.class, () -> reverseString(input));
    }

}