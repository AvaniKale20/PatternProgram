import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightHalfTriangleTest {

//    @Test
//    public void givenOneNthAndOneMthNumber_WhenPrint_ThenShouldPrintEmptySpace() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(1, 1);
//
//        Assertions.assertEquals("", rightHalfTriangle.print());
//
//    }

//    @Test
//    public void givenOneNthAndTwoMthNumber_WhenPrint_ThenShouldPrintEmptySpace() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(1, 2);
//
//        Assertions.assertEquals("  ", rightHalfTriangle.print());
//
//    }

//    @Test
//    public void givenTwoNthAndOneMthNumber_WhenPrint_ThenShouldPrintEmptySpace() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(2, 1);
//
//        Assertions.assertEquals(" \n ", rightHalfTriangle.print());
//
//    }

    @Test
    public void givenTwoNthAndTwoMthNumber_WhenPrint_ThenShouldPrintOneStar() {
        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(2, 2);

        Assertions.assertEquals(" *\n**", rightHalfTriangle.print());

    }
//
//    @Test
//    public void givenOneNthAndThreeMthNumber_WhenPrint_ThenShouldPrintOneStar() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(1, 3);
//
//        Assertions.assertEquals("  *", rightHalfTriangle.print());
//
//    }

//    @Test
//    public void givenThreeNthAndOneMthNumber_WhenPrint_ThenShouldPrintOneStar() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(3, 1);
//
//        Assertions.assertEquals(" \n \n*", rightHalfTriangle.print());
//
//    }
//
//    @Test
//    public void givenTwoNthAndThreeMthNumber_WhenPrint_ThenShouldPrintThreeStar() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(2, 3);
//
//        Assertions.assertEquals("  *\n **", rightHalfTriangle.print());
//
//    }

//    @Test
//    public void givenThreeNthAndTTwoMthNumber_WhenPrint_ThenShouldPrintThreeStar() {
//        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(3, 2);
//
//        Assertions.assertEquals("  \n *\n**", rightHalfTriangle.print());
//    }

    @Test
    public void givenThreeNthAndThreeMthNumber_WhenPrint_ThenShouldPrintSixStar() {
        RightHalfTriangle rightHalfTriangle = new RightHalfTriangle(3, 3);

        Assertions.assertEquals("  *\n **\n***", rightHalfTriangle.print());

    }
}
