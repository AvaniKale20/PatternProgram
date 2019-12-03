import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftHalfTranglePatternTest {

    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintTwoStar() {
        LeftHalfTranglePattern leftHalfTranglePattern = new LeftHalfTranglePattern(2, 2);

        Assertions.assertEquals("*\n**", leftHalfTranglePattern.print());

    }

}
