import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternatePatternStarTest {
    @Test
    public void givenOneNthAndOneMthNumber_WhenPrint_ThenShouldPrintOneStar() {
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(1, 1);
//        System.out.println("multiplication for 1st test 1*1=" + 1 * 1);
        Assertions.assertEquals("*", alternateStarPattern.print());
    }

    @Test
    public void givenTwoNthAndOneMthNumber_WhenPrint_ThenShouldPrintOneStar() {
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(2, 1);
//        System.out.println("multiplication for 2nd test 2*1=" + 2 * 1);
        Assertions.assertEquals("*\n-", alternateStarPattern.print());

    }

    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintOneStarAndOneHifun() {
        System.out.println("multiplication for 3rd test 1*2=" + 1 * 2);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(1, 2);
        Assertions.assertEquals("*-", alternateStarPattern.print());
    }

    @Test
    public void givenTwoNthAndFourMthNumber_WhenPrint_ThenShouldPrintAlternetFourStarAndFourHifun() {
        System.out.println("multiplication for 6th test 2*2=" + 2 * 2);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(2, 2);
        Assertions.assertEquals("*-\n-*", alternateStarPattern.print());

    }

    @Test
    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintAlternateStarAndHifun() {
        System.out.println("multiplication for 4th test 1*3=" + 1 * 3);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(1, 3);
        Assertions.assertEquals("*-*", alternateStarPattern.print());
    }

    @Test
    public void givenTwoNthAndThreeMthNumber_WhenPrint_ThenShouldPrintAlternetThreeStarAndThreeHifun() {
        System.out.println("multiplication for 5th test 2*3=" + 2 * 3);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(2, 3);
        Assertions.assertEquals("*-*\n-*-", alternateStarPattern.print());
    }

    @Test
    public void givenThreeNthAndTwoMthNumber_WhenPrint_ThenShouldPrintAlternetThreeStarAndThreeHifun() {
        System.out.println("multiplication for 5th test 3*2=" + 3 * 2);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(3, 2);
        Assertions.assertEquals("*-\n-*\n*-", alternateStarPattern.print());
    }

    @Test
    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintAlternetNineStarAndFourHifun() {
        System.out.println("multiplication for 6th test 2*2=" + 3 * 3);
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(3, 3);
        Assertions.assertEquals("*-*\n-*-\n*-*", alternateStarPattern.print());

    }
}
