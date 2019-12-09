public class AlternateHalfTriangle {
    private int nth;
    private int mth;

    public AlternateHalfTriangle(int nth, int mth) {
        this.nth = nth;
        this.mth = mth;
    }

    public String print() {
        String result = "";
        boolean alternateChanges = true;
        for (int n = 1; n <= nth; n++) {
            for (int m = 1; m <= n; m++) {
                if (alternateChanges == true) {
                    result = result + "*";
                    alternateChanges = false;
                    System.out.println("m1 alternate left half triangle pattern for *=" + m);

                } else {
                    result = result + "-";
                    alternateChanges = true;
                    System.out.println("m2 alternate left half triangle pattern for -=" + m);

                }
            }
            if (n != nth) {
                result = result + "\n";
            }
        }
        return result;
    }
}
