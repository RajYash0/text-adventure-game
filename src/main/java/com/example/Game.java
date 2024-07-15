package com.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameState gameState = new GameState();
        Story story = new Story();

        while (true) {
            System.out.println(story.getCurrentScene(gameState));
            System.out.println("Choose an option:");
            String[] options = story.getOptions(gameState);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            int choice = getValidChoice(scanner, options.length);
            story.makeChoice(gameState, choice);

            if (gameState.isGameOver()) {
                System.out.println("Game Over! " + gameState.getEndingMessage());
                break;
            }
        }

        scanner.close();
    }

    private static int getValidChoice(Scanner scanner, int numOptions) {
        int choice = -1;
        while (choice < 1 || choice > numOptions) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // Clear invalid input
            }
        }
        return choice;
    }
}
