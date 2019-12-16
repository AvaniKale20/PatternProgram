import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftHalfTranglePatternTest {

    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintTwoStar() {
        LeftHalfTranglePattern leftHalfTranglePattern = new LeftHalfTranglePattern(2, 2);

        Assertions.assertEquals("*\n**", leftHalfTranglePattern.print());

    }

    @Test
    public void givenTwoNthAndFourMthNumber_WhenPrint_ThenShouldPrintEightStar() {
        LeftHalfTranglePattern leftHalfTranglePattern = new LeftHalfTranglePattern(3, 3);

        Assertions.assertEquals("*\n**\n***", leftHalfTranglePattern.print());

    }

}
