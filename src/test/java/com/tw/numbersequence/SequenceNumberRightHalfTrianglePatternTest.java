package com.tw.numbersequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceNumberRightHalfTrianglePatternTest {
    @Test
    public void givenOneRthAndCth_WhenPrint_ThenShouldPrintOne() {
        SequenceNumberRightHalfTrianglePattern sequenceNumberRightHalfTrianglePattern = new SequenceNumberRightHalfTrianglePattern(1);

        Assertions.assertEquals("1", sequenceNumberRightHalfTrianglePattern.print());

    }

    @Test
    public void givenTwoRthAndCth_WhenPrint_ThenShouldPrintOneToThree() {
        SequenceNumberRightHalfTrianglePattern sequenceNumberRightHalfTrianglePattern = new SequenceNumberRightHalfTrianglePattern(2);

        Assertions.assertEquals(" 1\n23", sequenceNumberRightHalfTrianglePattern.print());

    }

    @Test
    public void givenThreeRthAndCth_WhenPrint_ThenShouldPrintOneToSix() {
        SequenceNumberRightHalfTrianglePattern sequenceNumberRightHalfTrianglePattern = new SequenceNumberRightHalfTrianglePattern(3);

        Assertions.assertEquals("  1\n 23\n456", sequenceNumberRightHalfTrianglePattern.print());

    }

    @Test
    public void givenFourRthAndCth_WhenPrint_ThenShouldPrintOneToSix() {
        SequenceNumberRightHalfTrianglePattern sequenceNumberRightHalfTrianglePattern = new SequenceNumberRightHalfTrianglePattern(4);

        Assertions.assertEquals("   1\n  23\n 456\n78910", sequenceNumberRightHalfTrianglePattern.print());

    }
}