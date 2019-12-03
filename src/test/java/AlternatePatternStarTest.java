import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternatePatternStarTest {
    @Test
    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintOneStarAndOneHifun() {
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(1, 2);

        Assertions.assertEquals("*-", alternateStarPattern.print());
    }

    @Test
    public void givenOneNthAndThreeMthNumber_WhenPrint_ThenShouldPrintOneStarAndOneHifunAndOneStar() {
        AlternateStarPattern alternateStarPattern = new AlternateStarPattern(1, 3);

        Assertions.assertEquals("*-*", alternateStarPattern.print());
    }
}
