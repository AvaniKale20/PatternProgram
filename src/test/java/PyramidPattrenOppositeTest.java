import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PyramidPattrenOppositeTest {

    @Test
    public void givenOneNthAndOneMthNumber_WhenPrint_ThenShouldShowSpace() {
        PyramidPattrenOpposite pyramidPattrenOpposite = new PyramidPattrenOpposite(1, 1);

        Assertions.assertEquals("*", pyramidPattrenOpposite.print());

    }
    @Test
    public void givenThreeNthAndFiveMthNumber_WhenPrint_ThenShouldPrintStar() {
        PyramidPattrenOpposite pyramidPattrenOpposite = new PyramidPattrenOpposite(3, 5);

        Assertions.assertEquals("*****\n *** \n  *  ", pyramidPattrenOpposite.print());

    }
    @Test
    public void givenFourNthAndSevenMthNumber_WhenPrint_ThenShouldPrintStar() {
        PyramidPattrenOpposite pyramidPattrenOpposite = new PyramidPattrenOpposite(4, 7);

        Assertions.assertEquals("*******\n ***** \n  ***  \n   *   ", pyramidPattrenOpposite.print());

    }
}
