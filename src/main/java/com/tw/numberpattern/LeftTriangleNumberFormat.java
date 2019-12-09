package com.tw.numberpattern;

public class LeftTriangleNumberFormat {
    private int rowAndColumn;


    public LeftTriangleNumberFormat(int rowAndColumn) {
        this.rowAndColumn = rowAndColumn;
    }

    public String print() {
        String result = "";
        for (int r = 1; r <= rowAndColumn; r++) {
            int number = 1;
            for (int c = 1; c <= r; c++) {
                result = result + number;
                number++;
            }
            if (r != rowAndColumn) {
                result = result + "\n";
            }

        }
        return result;
    }
}
