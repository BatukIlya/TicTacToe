package main;

import main.service.PreparationService;

public class Main {
    public static void main(String[] args) {
        PreparationService preparationService = new PreparationService();
        preparationService.preparation();
        while(preparationService.repeatGameOrNot()){
            preparationService.preparation();
        }
    }
}
