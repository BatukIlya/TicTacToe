package main.service;

import main.engine.GameEngine;
import main.entity.Computer;
import main.entity.Entity;
import main.entity.Player;

import java.util.Scanner;

public class PreparationService {
    public void preparation(){
        Scanner scanner = new Scanner(System.in);
        GameEngine gameEngine = new GameEngine();
        System.out.println("Do you want to play with each other player or computer? \n" +
                "Press 1. (for play with computer)\n" +
                "Press 2. (for play with you friend)");
        int choice = 0;
        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
        }else{
            System.out.println("You entered an incorrect value!!!\n");
            preparation();
        }

        switch (choice){
            case 1:
                Entity entity1 = new Player('x', "Player 1");
                Entity entity2 = new Computer('o');
                gameEngine.startGame(entity1, entity2);
                break;
            case 2:
                Entity entity3 = new Player('x', "Player 1");
                Entity entity4 = new Player('o', "Player 2");
                gameEngine.startGame(entity3, entity4);
                break;
            default:
                System.out.println("You entered an incorrect value!!!\n");
                preparation();
        }


    }
}
