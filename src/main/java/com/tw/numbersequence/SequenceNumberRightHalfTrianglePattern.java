package com.tw.numbersequence;

public class SequenceNumberRightHalfTrianglePattern {
    private int rowAndColumn;

    public SequenceNumberRightHalfTrianglePattern(int rowAndColumn) {
        this.rowAndColumn = rowAndColumn;
    }

    public String print() {
        String result = "";
        int number = 1;

        for (int r = 1; r <= rowAndColumn; r++) {
            for (int c = 1; c <= rowAndColumn; c++) {
                if (!(c >= (rowAndColumn + 1) - r)) {
                    result = result + " ";
                } else {
                    result = result + number;
                    number++;
                }
            }
            if (r != rowAndColumn) {
                result = result + "\n";
            }
        }
        return result;
    }
}
