package com.tw.numbersequence;

import com.tw.numberpattern.SimpleNumberFormate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSequenceSquarePatternTest {
    @Test
    public void givenOneNthAndMth_WhenPrint_ThenShouldPrintOne() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(1, 1);

        Assertions.assertEquals("1", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenOneNthAndTwoMth_WhenPrint_ThenShouldPrintOneTwo() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(1, 2);

        Assertions.assertEquals("12", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenTwoRthAndOneCth_WhenPrint_ThenShouldPrintOneTwoAnd() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(2, 1);

        Assertions.assertEquals("1\n2", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenTwoNthAndMth_WhenPrint_ThenShouldPrintOneTwoAndOneTwo() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(2, 2);

        Assertions.assertEquals("12\n34", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenOneRthAndThreeCth_WhenPrint_ThenShouldPrintOneTwoAndThree() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(1, 3);

        Assertions.assertEquals("123", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenTwoRthAndThreeCth_WhenPrint_ThenShouldPrintOneToSix() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(2, 3);

        Assertions.assertEquals("123\n456", numberSequenceSquarePattern.print());

    }

    @Test
    public void givenThreeRthAndThreeCth_WhenPrint_ThenShouldPrintOneToNine() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(3, 3);

        Assertions.assertEquals("123\n456\n789", numberSequenceSquarePattern.print());

    }
    @Test
    public void givenFourRthAndCth_WhenPrint_ThenShouldPrintOneToNine() {
        NumberSequenceSquarePattern numberSequenceSquarePattern = new NumberSequenceSquarePattern(4, 4);

        Assertions.assertEquals("1234\n5678\n9101112\n13141516", numberSequenceSquarePattern.print());

    }

}
