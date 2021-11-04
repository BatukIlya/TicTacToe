package main.engine;

import main.entity.Entity;
import main.entity.Table;
import main.service.TableService;

public class GameEngine {

    public void startGame(Entity[] entity, Table table, TableService tableService) {
        System.out.println("\nTicTacToe begins!!!\n");
        tableService.showTable(table);
        while (true) {
            System.out.println(entity[0].getName() + " is playing");
            entity[0].step(tableService, table);
            tableService.showTable(table);
            if (tableService.checkWins(table, entity[0].getValue())) {
                System.out.println(entity[0].getName() + " WIN!!");
                break;
            }
            if (tableService.tableFull(table)) {
                break;
            }
            System.out.println(entity[1].getName() + " is playing");
            entity[1].step(tableService, table);
            tableService.showTable(table);
            if (tableService.checkWins(table, entity[1].getValue())) {
                System.out.println(entity[1].getName() + " WIN!!!");
                break;
            }
            if (tableService.tableFull(table)) {
                break;
            }
        }
    }
}
