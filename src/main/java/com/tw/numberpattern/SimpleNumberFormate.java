package com.tw.numberpattern;

public class SimpleNumberFormate {
    private int row;
    private int column;

    public SimpleNumberFormate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String print() {
        String result = "";
        for (int r = 1; r <= row; r++) {
            int number = 1;
            for (int c = 1; c <= column; c++) {
                result = result + number;
                number++;
            }
            if(r!=row)
                result=result+"\n";
        }
        return result;
    }
}
