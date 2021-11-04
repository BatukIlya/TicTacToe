package main;

import main.engine.GameEngine;
import main.entity.Table;
import main.service.PreparationService;
import main.service.TableService;

public class Main {
    public static void main(String[] args) {
        PreparationService preparationService = new PreparationService();
        GameEngine gameEngine = new GameEngine();
        TableService tableService = new TableService();
        System.out.println("Welcome to TicTacToe\n");
        do {
            gameEngine.startGame(preparationService.preparation(), new Table(), tableService);
        }
        while (preparationService.repeatGameOrNot());
    }
}
