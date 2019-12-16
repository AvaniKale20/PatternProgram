import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightHalfTriangleTest {

    @Test
    public void givenTwoNthAndTwoMthNumber_WhenPrint_ThenShouldPrintOneStar() {
        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(2, 2);

        Assertions.assertEquals(" *\n**", rightHalfTriangle.print());

    }

    @Test
    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintSixStar() {
        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(3, 3);

        Assertions.assertEquals("  *\n **\n***", rightHalfTriangle.print());

    }
}
