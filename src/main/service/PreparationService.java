package main.service;

import main.entity.Computer;
import main.entity.Entity;
import main.entity.Player;

import java.util.Scanner;

public class PreparationService {

    //Prepares entities for the game depending on the choice
    public Entity[] preparation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play with each other player or computer? \n" +
                "Press 1. (for play with computer)\n" +
                "Press 2. (for play with you friend)");
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (x > 0 && x < 3) {
                    choice = x;
                    break;
                } else {
                    System.out.println("You entered an incorrect value!!!\n Enter 1 or 2...");
                    scanner.nextLine();
                    continue;
                }
            } else {
                System.out.println("You entered an incorrect value!!!\n Enter 1 or 2...");
                scanner.nextLine();
            }
        }

        Entity[] entity = new Entity[2];

        switch (choice) {
            case 1:
                entity[0] = new Player('x', "Player");
                entity[1] = new Computer('o');
                return entity;
            case 2:
                entity[0] = new Player('x', "Player 1");
                entity[1] = new Player('o', "Player 2");
                return entity;
        }
        System.exit(0);
        return entity;
    }

    //Allows you to start the game again or finish it
    public boolean repeatGameOrNot() {
        Scanner scanner = new Scanner(System.in);
        final String YES = "yes";
        final String NO = "no";

        System.out.println("Do you want to play again???\n Entry Yes or No...\n");

        while (true) {
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals(YES)) {
                return true;
            } else if (choice.equals(NO)) {
                System.out.println("Good bye!!!");
                return false;
            } else {
                System.out.println("You entry incorrect value!!!\n Entry Yes or No...");
            }
        }

    }
}

