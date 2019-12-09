package com.tw.numberpattern;

public class LeftAboveNumberPattern {
    private int rowAndColumn;

    public LeftAboveNumberPattern(int rowAndColumn) {
        this.rowAndColumn = rowAndColumn;
    }

    public String print() {
        String result = "";
        for (int r = 1; r <= rowAndColumn; r++) {
            int number = 1;
            for (int c = 1; c <= rowAndColumn; c++) {
                if (c >= 1 && c <= (rowAndColumn + 1) - r) {

                    result = result + number;
                }
                number++;
            }
            if (r != rowAndColumn) {
                result = result + "\n";
            }
        }

        return result;
    }
}
