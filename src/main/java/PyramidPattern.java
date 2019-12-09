public class PyramidPattern {
    private int ith;
    private int jth;

    public PyramidPattern(int ith, int jth) {
        this.ith = ith;
        this.jth = jth;
    }

    public String print() {
        String output = "";
        for (int i = 1; i <= ith; i++) {
            for (int j = 1; j <= jth; j++) {
                if ((j >= (ith + 1) - i) && (j <= (ith - 1) + i)) {
                    output = output + "*";
                } else {
                    output = output + " ";
                }
            }
            if (i != ith) {
                output = output + "\n";
            }
        }
        return output;

    }
}
