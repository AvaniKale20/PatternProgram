import com.tw.numberpattern.LeftTriangleNumberFormat;
import com.tw.numberpattern.SimpleNumberFormate;
import com.tw.numbersequence.NumberSequencePyramidPattern;
import com.tw.numbersequence.SequenceNumberRightHalfTrianglePattern;

public class Main {
    public static void main(String[] args) {
        NumberSequencePyramidPattern numberSequencePyramidPattern = new NumberSequencePyramidPattern(2, 3);
        System.out.println(numberSequencePyramidPattern.print());
    }
}
