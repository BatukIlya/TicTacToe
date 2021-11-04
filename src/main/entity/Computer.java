package main.entity;

import main.service.TableService;

import java.util.Random;

public class Computer implements Entity {

    private final char VALUE;
    private final String name = "Computer";

    public Computer(char value) {
        this.VALUE = value;
    }

    @Override
    public boolean isPlayer() {
        return false;
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
    public void step(TableService tableService, Table table) {
        Random random = new Random();
        int x;
        int x1;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        do {
            x = random.nextInt(3);
            x1 = random.nextInt(3);
        } while (!tableService.isCellOfTableValid(x, x1, this.isPlayer(), table));
        tableService.setValueTable(x, x1, this.VALUE, table);
    }
}
