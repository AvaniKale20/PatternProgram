import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PyramidPatternTest {

    @Test
    public void givenOneNthAndOneMthNumber_WhenPrint_ThenShouldShowSpace() {
        PyramidPattern pyramidPattern = new PyramidPattern(1, 1);

        Assertions.assertEquals("*", pyramidPattern.print());

    }

    @Test
    public void givenTwoNthAndThreeMthNumber_WhenPrint_ThenShouldPrintThreeSpaceAndThreeStar() {
        PyramidPattern pyramidPattern = new PyramidPattern(2, 3);

        Assertions.assertEquals(" * \n***", pyramidPattern.print());

    }

    @Test
    public void givenFiveNthAndFiveMthNumber_WhenPrint_ThenShouldPrintThreeSpaceAndFiveStar() {
        PyramidPattern pyramidPattern = new PyramidPattern(3, 5);

        Assertions.assertEquals("  *  \n *** \n*****", pyramidPattern.print());

    }

    @Test
    public void givenFourNthAndSevenMthNumber_WhenPrint_ThenShouldPrintNineStar() {
        PyramidPattern pyramidPattern = new PyramidPattern(4, 7);

        Assertions.assertEquals("   *   \n  ***  \n ***** \n*******", pyramidPattern.print());

    }
}
