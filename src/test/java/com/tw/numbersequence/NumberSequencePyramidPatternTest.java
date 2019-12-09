package com.tw.numbersequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSequencePyramidPatternTest {
    @Test
    public void givenOneRthAndCthNumber_WhenPrint_ThenShouldPrintOneNumber() {
        NumberSequencePyramidPattern numberSequencePyramidPattern = new NumberSequencePyramidPattern(1, 1);

        Assertions.assertEquals("1", numberSequencePyramidPattern.print());

    }

    @Test
    public void givenTwoNthAndThreeMthNumber_WhenPrint_ThenShouldPrintThreeSpaceAndThreeStar() {
        NumberSequencePyramidPattern numberSequenceSquarePattern = new NumberSequencePyramidPattern(2, 3);

        Assertions.assertEquals(" 1 \n234", numberSequenceSquarePattern.print());

    }

}
