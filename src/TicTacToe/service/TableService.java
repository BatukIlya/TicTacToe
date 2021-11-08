package TicTacToe.service;

import TicTacToe.entity.Table;

public class TableService {
    private Table table;

    public TableService() {
        this.table = new Table();
    }

    /**
     * Checks if the cell is already occupied by the value
     */
    public boolean isCellOfTableValid(int x, int y, boolean isPlayer) {
        boolean validValue = table.getTable()[x][y] == table.getVALUE_IS_EMPTY();
        if (isPlayer && !validValue) {
            showTable();
            System.out.println("ERROR : This cell is full, select another cell...");
            return false;
        }
        return validValue;
    }

    /**
     * Inserts a value into a cell
     */
    public void setValueTable(int x, int y, char value) {
        table.getTable()[x][y] = value;
    }

    public void showTable() {
        System.out.println("   a  b  c");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table.getTable()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Performs a check for the fullness of the table
     */
    public boolean tableFull() {
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

    /**
     * Performs a WIN check
     */
    public boolean checkWins(char value) {
        if (checkWinsHorizontally(value) || checkWinsVertically(value) || checkWinsDiagonally(value)) {
            return true;
        }
        return false;
    }

    private boolean checkWinsHorizontally(char value) {
        for (int i = 0; i < table.getTable().length; i++) {
            if (table.getTable()[i][0] == value && table.getTable()[i][1] == value && table.getTable()[i][2] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinsVertically(char value) {
        for (int i = 0; i < table.getTable().length; i++) {
            if (table.getTable()[0][i] == value && table.getTable()[1][i] == value && table.getTable()[2][i] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinsDiagonally(char value) {
        if ((table.getTable()[0][0] == value && table.getTable()[1][1] == value && table.getTable()[2][2] == value) ||
                (table.getTable()[2][0] == value && table.getTable()[1][1] == value && table.getTable()[0][2] == value)) {
            return true;
        }
        return false;
    }
}
