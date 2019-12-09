
public class AlternateStarPattern {
    private int nth;
    private int mth;

    public AlternateStarPattern(int nth, int mth) {
        this.nth = nth;
        this.mth = mth;
    }

    // 1:1st we need for loop for both nth and mth number
// 2:we have to print * and - alternately i.e we can take if else statement
// 3:give condition for alternately printing


//    public String print() {
//        boolean v = false;
//        String output = "";
//        for (int n = 1; n <= nth; n++) {
//            for (int m = 1; m <= mth; m++) {
//
//                if (v == false) {
//                    output = output + "*";
//                    v = true;
//                } else {
//                    output = output + "-";
//                    v = false;
//
//                }
//            }
//            if (n != nth) {
//                output = output + "\n";
//            }
//        }
//        return output;}
//todo------------------------------------------------

    public String print() {


        String output = "";
//        int updateAlternateChanges = 1;
        for (int n = 1; n <= nth; n++) {
            for (int m = 1; m <= mth; m++) {

                if ((n + m) % 2 == 0) {
                    output = output + "*";
                    System.out.println("m1 for *=" + m);
                    //updateAlternateChanges = m + updateAlternateChanges;
                } else {
                    output = output + "-";//p1 p2
                    System.out.println("m2 for - =" + n);
                    //updateAlternateChanges = m + updateAlternateChanges;
                }
            }
            if (n != nth) {
                output = output + "\n";
            }
        }
        return output;
    }
}

