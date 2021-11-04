package main;

import main.engine.GameEngine;
import main.entity.Table;
import main.service.PreparationService;

public class Main {
    public static void main(String[] args) {
        PreparationService preparationService = new PreparationService();
        GameEngine gameEngine = new GameEngine();
        do {
            gameEngine.startGame(preparationService.preparation(), new Table());
        }
        while (preparationService.repeatGameOrNot());
        {
            gameEngine.startGame(preparationService.preparation(), new Table());
        }


    }
}
