package main.entity;

public class Table {
    private char[][] table;
    private final char VALUE_IS_EMPTY = '-';

    public Table() {
        table = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = VALUE_IS_EMPTY;
            }
        }
    }

    public boolean isCellOfTableValid(int x, int x1, boolean isPlayer) {
        boolean validValue = table[x][x1] == VALUE_IS_EMPTY;
        if (isPlayer && !validValue) {
            System.out.println("This cell is full, select another cell...");
        }
        return validValue;
    }

    public void setValueTable(int x, int x1, char value) {
        table[x][x1] = value;
    }

    public void showTable() {
        System.out.println("   a  b  c");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public boolean tableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == VALUE_IS_EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("Table is full! Game over!\n");
        return true;
    }

    public boolean checkWins(Table table, char v) {
        for (int i = 0; i < 3; i++) {
            if ((table.table[i][0] == v && table.table[i][1] == v && table.table[i][2] == v) ||
                    (table.table[0][i] == v && table.table[1][i] == v && table.table[2][i] == v) ||
                    (table.table[0][0] == v && table.table[1][1] == v && table.table[2][2] == v) ||
                    (table.table[2][0] == v && table.table[1][1] == v && table.table[0][2] == v)) {
                return true;
            }
        }
        return false;
    }
}

