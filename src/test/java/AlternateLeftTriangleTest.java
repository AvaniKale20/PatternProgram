import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternateLeftTriangleTest {

    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintStarAndHifunAlternately() {
        AlternateHalfTriangle alternetHalfTriangle = new AlternateHalfTriangle(2, 2);

        Assertions.assertEquals("*\n-*", alternetHalfTriangle.print());

    }

    @Test
    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintStarAndHifunAlternately() {
        AlternateHalfTriangle alternetHalfTriangle = new AlternateHalfTriangle(3, 3);

        Assertions.assertEquals("*\n-*\n-*-", alternetHalfTriangle.print());

    }
}
