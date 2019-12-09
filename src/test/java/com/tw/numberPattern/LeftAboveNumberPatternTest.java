package com.tw.numberPattern;

import com.tw.numberpattern.LeftAboveNumberPattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftAboveNumberPatternTest {
    @Test
    public void givenOneRthAndOneCth_WhenPrint_ThenShouldPrintOne() {
        LeftAboveNumberPattern leftAboveNumberPattern = new LeftAboveNumberPattern(1);

        Assertions.assertEquals("1", leftAboveNumberPattern.print());

    }

    @Test
    public void givenTwoRthAndTwoCth_WhenPrint_ThenShouldPrintOneTwoAndOne() {
        LeftAboveNumberPattern leftAboveNumberPattern = new LeftAboveNumberPattern(2);

        Assertions.assertEquals("12\n1", leftAboveNumberPattern.print());

    }

    @Test
    public void givenThreeRthAndCth_WhenPrint_ThenShouldPrintOneTwoThreeAndOneTwoAndThree() {
        LeftAboveNumberPattern leftAboveNumberPattern = new LeftAboveNumberPattern(3);

        Assertions.assertEquals("123\n12\n1", leftAboveNumberPattern.print());

    }
}
