public class RectangleStarPattern {

    private int nthNumber;
    private int mthNumber;

    public RectangleStarPattern(int nthNumber, int mthNumber) {
        this.nthNumber = nthNumber;
        this.mthNumber = mthNumber;
    }


    public String print() {
        String result = "";
        for (int n = 1; n <= nthNumber; n++) {
            for (int m = 1; m <= mthNumber; m++) {
                result = result + "*";
            }
            if (n != nthNumber) {
                result = result + "\n";
            }
        }
        return result;

    }
}
