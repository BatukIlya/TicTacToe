package main.entity;

public class Table {
    private char[][] getTable;
    private final char VALUE_IS_EMPTY = '-';

    public Table() {
        getTable = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                getTable[i][j] = VALUE_IS_EMPTY;
            }
        }
    }

    public char[][] getTable() {
        return getTable;
    }

    public char getVALUE_IS_EMPTY() {
        return VALUE_IS_EMPTY;
    }
}

