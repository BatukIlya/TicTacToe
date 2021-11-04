package main.service;

import main.entity.Table;

public class TableService{

    // Checks if the cell is already occupied by the value
    public boolean isCellOfTableValid(int x, int x1, boolean isPlayer, Table table) {
        boolean validValue = table.getTable()[x][x1] == table.getVALUE_IS_EMPTY();
        if (isPlayer && !validValue) {
            showTable(table);
            System.out.println("ERROR : This cell is full, select another cell...");
            return false;
        }
        return validValue;
    }

    // Inserts a value into a cell
    public void setValueTable(int x, int x1, char value, Table table) {
        table.getTable()[x][x1] = value;
    }

    public void showTable(Table table) {
        System.out.println("   a  b  c");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table.getTable()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //Performs a check for the fullness of the table
    public boolean tableFull(Table table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table.getTable()[i][j] == table.getVALUE_IS_EMPTY()) {
                    return false;
                }
            }
        }
        System.out.println("Table is full! Game over!");
        return true;
    }

    //Performs a WIN check
    public boolean checkWins(Table table, char v) {
        for (int i = 0; i < 3; i++) {
            if ((table.getTable()[i][0] == v && table.getTable()[i][1] == v && table.getTable()[i][2] == v) ||
                    (table.getTable()[0][i] == v && table.getTable()[1][i] == v && table.getTable()[2][i] == v) ||
                    (table.getTable()[0][0] == v && table.getTable()[1][1] == v && table.getTable()[2][2] == v) ||
                    (table.getTable()[2][0] == v && table.getTable()[1][1] == v && table.getTable()[0][2] == v)) {
                return true;
            }
        }
        return false;
    }
}
