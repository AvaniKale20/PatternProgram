package com.tw.numbersequence;

public class SequenceNumberLeftHalfTrianglePattern {
    private int row;

    public SequenceNumberLeftHalfTrianglePattern(int row) {
        this.row = row;
    }

    public String print() {
        String output = "";
        int number = 1;
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= r; c++) {
                output = output + number;
                number++;
            }
            if (r != row) {
                output = output + "\n";
            }
        }
        return output;
    }
}
