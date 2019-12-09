package com.tw.numberPattern;

import com.tw.numberpattern.SimpleNumberFormate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleNumberFormateTest {
    @Test
    public void givenOneNthAndMth_WhenPrint_ThenShouldPrintOne() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(1, 1);

        Assertions.assertEquals("1", simpleNumberFormate.print());

    }

    @Test
    public void givenOneRthAndTwoCth_WhenPrint_ThenShouldPrintOneAndTwo() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(1, 2);

        Assertions.assertEquals("12", simpleNumberFormate.print());

    }

    @Test
    public void givenTwoRthAndOneCth_WhenPrint_ThenShouldPrintOneAndOne() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(2, 1);

        Assertions.assertEquals("1\n1", simpleNumberFormate.print());

    }

    @Test
    public void givenTwoRthAndTwoCth_WhenPrint_ThenShouldPrintOneTwoAndOneTwo() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(2, 2);

        Assertions.assertEquals("12\n12", simpleNumberFormate.print());

    }

    @Test
    public void givenThreeRthAndThreeCth_WhenPrint_ThenShouldPrintOneAndTwoAndThree() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(3, 3);

        Assertions.assertEquals("123\n123\n123", simpleNumberFormate.print());

    }
}
