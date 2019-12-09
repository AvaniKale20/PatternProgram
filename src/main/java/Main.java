import com.tw.numberpattern.LeftTriangleNumberFormat;
import com.tw.numberpattern.SimpleNumberFormate;
import com.tw.numbersequence.SequenceNumberRightHalfTrianglePattern;

public class Main {
    public static void main(String[] args) {
//        RightHalfTriangle r = new RightHalfTriangle(5, 5);
//        r.print();
//        System.out.println(r.print());
/////////////////////////////////
//        PyramidPattern r = new PyramidPattern(4, 7);
//        r.print();
//        System.out.println("start");
//        System.out.println(r.print());
        // System.out.println("end");
////////////////////////
     /*   PyramidPattrenOpposite pp = new PyramidPattrenOpposite(4, 7);

        pp.print();
        System.out.println("start");
        System.out.println(pp.print());
        System.out.println("end");*/
        ////////////////////////////

        //  SimpleNumberFormate simpleNumberFormate = new SimpleNumberFormate(2, 1);
        // System.out.println(simpleNumberFormate.print());

        /////

       // LeftTriangleNumberFormat leftTriangleNumberFormat = new LeftTriangleNumberFormat(2);
        //System.out.println(leftTriangleNumberFormat.print());
//////////////
        SequenceNumberRightHalfTrianglePattern sequenceNumberRightHalfTrianglePattern = new SequenceNumberRightHalfTrianglePattern(3);
        System.out.println(sequenceNumberRightHalfTrianglePattern.print());

    }
}
