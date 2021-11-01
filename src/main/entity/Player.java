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
    public String getName() {
        return name;
    }

    @Override
    public char getValue() {
        return VALUE;
    }

    @Override
    public void step(Table table) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int x1;

        do {
           x = scanner.nextInt();
           x1 = scanner.nextInt();
        } while (!table.isCellOfTableValid(x, x1));
        table.setValueTable(x, x1, this.VALUE);
    }
}
