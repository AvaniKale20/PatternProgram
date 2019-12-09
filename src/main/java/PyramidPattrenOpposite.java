public class PyramidPattrenOpposite {
    private int row;
    private int column;

    public PyramidPattrenOpposite(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String print() {
        String output = "";
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= column; c++) {
                if (c >= r && c <= (column + 1) - r) {
                    output = output + "*";

                } else {
                    output = output + " ";
                }
            }
            if (r != row) {
                output = output + "\n";
            }
        }
        return output;
    }
}
