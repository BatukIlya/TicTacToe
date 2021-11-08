package TicTacToe.engine;

import TicTacToe.entity.Entity;
import TicTacToe.service.TableService;

public class GameEngine {
    public void startGame(Entity[] entity, TableService tableService) {
        Entity player1 = entity[0];
        Entity player2 = entity[1];

        System.out.println("\nTicTacToe begins!!!\n");

        tableService.showTable();

        while (true) {
            System.out.println(player1.getNAME() + " is playing");
            player1.step(tableService);
            tableService.showTable();

            if (tableService.checkWins(player1.getValue())) {
                System.out.println(player1.getNAME() + " WIN!!");
                break;
            }

            if (tableService.tableFull()) {
                break;
            }

            System.out.println(player2.getNAME() + " is playing");
            player2.step(tableService);
            tableService.showTable();

            if (tableService.checkWins(player2.getValue())) {
                System.out.println(player2.getNAME() + " WIN!!!");
                break;
            }

            if (tableService.tableFull()) {
                break;
            }
        }
    }
}
