package com.tw.numberPattern;

import com.tw.numberpattern.LeftTriangleNumberFormat;
import com.tw.numberpattern.SimpleNumberFormate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftTriangleNumberFormatTest {

    @Test
    public void givenOneRthAndCth_WhenPrint_ThenShouldPrintOne() {
        LeftTriangleNumberFormat leftTriangleNumberFormat = new LeftTriangleNumberFormat(1);

        Assertions.assertEquals("1", leftTriangleNumberFormat.print());

    }

    @Test
    public void givenTwoRthAndTwoCth_WhenPrint_ThenShouldPrintOneAndOneTwo() {
        LeftTriangleNumberFormat leftTriangleNumberFormat = new LeftTriangleNumberFormat(2);

        Assertions.assertEquals("1\n12", leftTriangleNumberFormat.print());

    }

    @Test
    public void givenThreeRthAndThreeCth_WhenPrint_ThenShouldPrintOneAndOneTwoAndOneTwoThree() {
        LeftTriangleNumberFormat leftTriangleNumberFormat = new LeftTriangleNumberFormat(3);

        Assertions.assertEquals("1\n12\n123", leftTriangleNumberFormat.print());

    }
}
