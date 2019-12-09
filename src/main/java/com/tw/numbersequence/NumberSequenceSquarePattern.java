package com.tw.numbersequence;

public class NumberSequenceSquarePattern {
    private int row;
    private int column;

    public NumberSequenceSquarePattern(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String print() {
        String result = "";
        int number = 1;
        for (int r = 1; r <= row; r++) {

            for (int c = 1; c <= column; c++) {
                result = result + number;
                number++;
            }
            if (r != row) {
                result = result + "\n";
            }
        }
        return result;
    }
}
