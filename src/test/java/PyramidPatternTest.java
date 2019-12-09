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

//    @Test
//    public void givenThreeNthAndTwoMthNumber_WhenPrint_ThenShouldPrintThreeSpaceAndThreeStar() {
//        PyramidPattern pyramidPattern = new PyramidPattern(3, 2);
//
//        Assertions.assertEquals("\n*\n**", pyramidPattern.print());
//
//    }

//   @Test
//    public void givenThreeNthAndOneMthNumber_WhenPrint_ThenShouldPrintOneStarAndTwoSpace() {
//        PyramidPattern pyramidPattern = new PyramidPattern(3, 1);
//
//        Assertions.assertEquals("\n\n*", pyramidPattern.print());
//
//    }


//    @Test
//    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintThreeSpaceAndFiveStar() {
//        PyramidPattern pyramidPattern = new PyramidPattern(3, 3);
//
//        Assertions.assertEquals("*\n**\n***", pyramidPattern.print());
//
//    }

//    @Test
//    public void givenThreeNthAndFourMthNumber_WhenPrint_ThenShouldPrintFourSpaceAndEightStar() {
//        PyramidPattern pyramidPattern = new PyramidPattern(3, 4);
//
//        Assertions.assertEquals("*\n ***\n****", pyramidPattern.print());
//
//    }

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
