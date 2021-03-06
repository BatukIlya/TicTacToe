package TicTacToe.entity;

import TicTacToe.service.TableService;

import java.util.Scanner;

public class Player implements Entity {
    private final String NAME;
    private char VALUE;

    public Player() {
        this.VALUE = 'x';
        this.NAME = "Player";
    }


    public Player(char value, String name) {
        this.VALUE = value;
        this.NAME = name;
    }

    @Override
    public boolean isPlayer() {
        return true;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public char getValue() {
        return VALUE;
    }

    @Override
    public void step(TableService tableService) {
        int[] arrayValue;

        do {
            arrayValue = getArrayValue();
        } while (!tableService.isCellOfTableValid(arrayValue[0], arrayValue[1], this.isPlayer()));

        tableService.setValueTable(arrayValue[0], arrayValue[1], this.VALUE);

    }

    /**
     * Returns the value of the array cell after selecting the coordinates of the table cell
     */
    private int[] getArrayValue() {
        Scanner scanner = new Scanner(System.in);
        int[] arrayValue = new int[2];

        while (true) {
            System.out.println("Entry a value for the cell. (a1, b2, c3 .... for example)");
            String value = scanner.nextLine().toLowerCase();

            switch (value) {
                case "a1":
                    return arrayValue;
                case "a2":
                    arrayValue[0] = 1;
                    return arrayValue;
                case "a3":
                    arrayValue[0] = 2;
                    return arrayValue;
                case "b1":
                    arrayValue[1] = 1;
                    return arrayValue;
                case "b2":
                    arrayValue[0] = 1;
                    arrayValue[1] = 1;
                    return arrayValue;
                case "b3":
                    arrayValue[0] = 2;
                    arrayValue[1] = 1;
                    return arrayValue;
                case "c1":
                    arrayValue[1] = 2;
                    return arrayValue;
                case "c2":
                    arrayValue[0] = 1;
                    arrayValue[1] = 2;
                    return arrayValue;
                case "c3":
                    arrayValue[0] = 2;
                    arrayValue[1] = 2;
                    return arrayValue;
                default:
                    System.out.println("You entered incorrect value!!!");
            }
        }
    }
}
