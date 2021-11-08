package TicTacToe.service;

import TicTacToe.entity.Computer;
import TicTacToe.entity.Entity;
import TicTacToe.entity.Player;

import java.util.Scanner;

public class PreparationService {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final char VALUE_X = 'x';
    private static final char VALUE_O = 'o';

    /**
     * Prepares entities for the game depending on the choice
     */
    public Entity[] preparation() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Do you want to play with each other player or computer? \n" +
                "Press 1. (for play with computer)\n" +
                "Press 2. (for play with you friend)");

        while (true) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (x == 1 || x == 2) {
                    choice = x;
                    break;
                } else {
                    System.out.println("You entered an incorrect value!!!\n Enter 1 or 2...");
                    scanner.nextLine();
                }
            } else {
                System.out.println("You entered an incorrect value!!!\n Enter 1 or 2...");
                scanner.nextLine();
            }
        }

        Entity[] entity = new Entity[2];

        switch (choice) {
            case 1:
                entity[0] = new Player(VALUE_X, "Player");
                entity[1] = new Computer();
                return entity;
            case 2:
                entity[0] = new Player(VALUE_X, "Player 1");
                entity[1] = new Player(VALUE_O, "Player 2");
                return entity;
            default:
                throw new RuntimeException("Something went wrong!!! Sorry.");
        }
    }


    /**
     * Allows you to start the game again or finish it
     */
    public boolean repeatGameOrNot() {
        Scanner scanner = new Scanner(System.in);

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

