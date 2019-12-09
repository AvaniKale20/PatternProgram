package com.tw.numberPattern;

import com.tw.numberpattern.SimpleNumberFormate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleNumberFormateTest {
    @Test
    public void givenOneNthAndMth_WhenPrint_ThenShouldPrintOneAndTwo() {
        SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(1, 1);

        Assertions.assertEquals("1", simpleNumberFormate.print());

    }
}
