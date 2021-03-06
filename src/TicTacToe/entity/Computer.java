package TicTacToe.entity;

import TicTacToe.service.TableService;

import java.util.Random;

public class Computer implements Entity {
    private static final char VALUE = 'o';
    private static final String NAME = "Computer";


    @Override
    public boolean isPlayer() {
        return false;
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
        Random random = new Random();
        int x;
        int y;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!tableService.isCellOfTableValid(x, y, this.isPlayer()));

        tableService.setValueTable(x, y, this.VALUE);
    }
}
