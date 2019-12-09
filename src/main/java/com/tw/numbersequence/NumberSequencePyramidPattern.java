package com.tw.numbersequence;

public class NumberSequencePyramidPattern {
    private int row;
    private int col;

    public NumberSequencePyramidPattern(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String print() {
        String output = "";
        int number = 1;
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if ((c >= (row + 1) - r) && (c <= (row - 1) + r)) {
                    output = output + number;
                    number++;
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
