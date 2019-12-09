public class LeftHalfTranglePattern {

    private final int nth;
    private final int mth;

    public LeftHalfTranglePattern(int nth, int mth) {
        this.nth = nth;
        this.mth = mth;
    }

    public String print() {
        String result = "";
        for (int n = 1; n <= nth; n++) {
            for (int m = 1; m <= n; m++) {
                result = result + "*";
            }
            if (n != nth) {
                result = result + "\n";
            }

        }

        return result;
    }
}
