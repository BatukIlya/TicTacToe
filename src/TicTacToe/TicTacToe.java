package TicTacToe;

import TicTacToe.engine.GameEngine;
import TicTacToe.service.PreparationService;
import TicTacToe.service.TableService;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe\n");
        PreparationService preparationService = new PreparationService();
        GameEngine gameEngine = new GameEngine();
        do {
            gameEngine.startGame(preparationService.preparation(), new TableService());
        }
        while (preparationService.repeatGameOrNot());
    }
}
