import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleStarPatternTest {

    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintTwoStar() {
        RectangleStarPattern rectangleStarPattern = new RectangleStarPattern(1, 2);

        Assertions.assertEquals("**", rectangleStarPattern.print());

    }

}
