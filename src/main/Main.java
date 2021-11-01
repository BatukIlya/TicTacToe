package main;

import main.engine.GameEngine;
import main.service.PreparationService;

public class Main {
    public static void main(String[] args) {
        PreparationService preparationService = new PreparationService();
        preparationService.preparation();
    }
}
