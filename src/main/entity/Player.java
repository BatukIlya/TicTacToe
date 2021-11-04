package main.entity;

import java.util.Scanner;

public class Player implements Entity {
    private final String name;
    private final char VALUE;

    public Player(char value, String name) {
        this.VALUE = value;
        this.name = name;
    }

    @Override
    public boolean isPlayer() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getValue() {
        return VALUE;
    }

    @Override
    public void step(Table table) {
        int x;
        int x1;

        do {
            x = getValidValue();
            x1 = getValidValue();
        } while (!table.isCellOfTableValid(x, x1, this.isPlayer()));
        table.setValueTable(x, x1, this.VALUE);
    }

    private int getValidValue() {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("Entry value 0...2");
            if (scanner.hasNextInt()) {
                x = Integer.parseInt(scanner.nextLine());
                if (x >= 0 && x < 3) {
                    return x;
                } else {
                    System.out.println("You entered an incorrect value!!!\n");
                }
            } else {
                System.out.println("You entered an incorrect value!!!\n");
                scanner.nextLine();
            }
        }
    }
}
