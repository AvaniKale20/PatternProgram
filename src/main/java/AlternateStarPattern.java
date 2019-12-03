public class AlternateStarPattern {
    private int nth;
    private int mth;

    public AlternateStarPattern(int nth, int mth) {
        this.nth = nth;
        this.mth = mth;
    }

    // 1:1st we need for loop for both nth and mth number
// 2:we have to print * and - alternately i.e we can take if else statement
// 3:give condition for alternately printing.
    public String print() {
        int updateAlternateChanges = 1;
        String output = "";
        for (int n = 1; n <= nth; n++) {
            for (int m = 1; m <= mth; m++) {
                if (updateAlternateChanges == m) {
                    output = output + "*";
                } else {
                    output = output + "-";
                    updateAlternateChanges = m + updateAlternateChanges;
                }
            }
        }
        return output;
    }
}
