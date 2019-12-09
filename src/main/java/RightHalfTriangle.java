public class RightHalfTriangle {
    private int nth;
    private int mth;

    public RightHalfTriangle(int nth, int mth) {
        this.nth = nth;
        this.mth = mth;
    }

    //    public String print() {
//        String output = "";
//        String reverse = "";
//        for (int n = 1; n <= nth; n++) {
//            for (int m = 1; m <= n; m++) {
//                output = output + "*";
//
//
//            }
//            if (n != nth) {
//                output = output + "\n";
//                System.out.println(n);
//            }
//        }
//        return output;
//    }
    public String print() {
        String output = "";
        for (int n = 1; n <= nth; n++) {
            for (int m = 1; m <= mth; m++) {
                if (!(m >= (mth + 1) - n)) {
                    output = output + " ";
                } else {
                    output = output + "*";
                }
            }
            if (n != nth) {
                output = output + "\n";
            }
        }
        return output;
    }
}
