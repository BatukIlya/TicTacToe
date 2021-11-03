package main.engine;

import main.entity.Entity;
import main.entity.Table;

public class GameEngine {
    public void startGame(Entity[] entity, Table table) {
        System.out.println("The game TicTacToe begins!!!\n");
        table.showTable();
        while (true) {
            System.out.println(entity[0].getName() + " is playing");
            entity[0].step(table);
            table.showTable();
            if (table.checkWins(table, entity[0].getValue())) {
                System.out.println(entity[0].getName() + " WIN!!");
                break;
            }
            if (table.tableFull()) {
                break;
            }
            System.out.println(entity[1].getName() + " is playing");
            entity[1].step(table);
            table.showTable();
            if (table.checkWins(table, entity[1].getValue())) {
                System.out.println(entity[1].getName() + " WIN!!!");
                break;
            }
            if (table.tableFull()) {
                break;
            }
        }
    }
}
