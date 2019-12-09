package com.tw.numbersequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceNumberLeftHalfTrianglePatternTest {
    @Test
    public void givenOneRthAndCth_WhenPrint_ThenShouldPrintOne() {
        SequenceNumberLeftHalfTrianglePattern sequenceNumberLeftHalfTrianglePattern = new SequenceNumberLeftHalfTrianglePattern(1);

        Assertions.assertEquals("1", sequenceNumberLeftHalfTrianglePattern.print());

    }
    @Test
    public void givenTwoRthAndCth_WhenPrint_ThenShouldPrintOneAndTwoThree() {
        SequenceNumberLeftHalfTrianglePattern sequenceNumberLeftHalfTrianglePattern = new SequenceNumberLeftHalfTrianglePattern(2);

        Assertions.assertEquals("1\n23", sequenceNumberLeftHalfTrianglePattern.print());

    }

    @Test
    public void givenThreeRthAndCth_WhenPrint_ThenShouldPrintOneAndTwoThreeAndFourFiveSix() {
        SequenceNumberLeftHalfTrianglePattern sequenceNumberLeftHalfTrianglePattern = new SequenceNumberLeftHalfTrianglePattern(3);

        Assertions.assertEquals("1\n23\n456", sequenceNumberLeftHalfTrianglePattern.print());

    }

}
