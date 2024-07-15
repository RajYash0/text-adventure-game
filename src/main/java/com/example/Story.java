package com.example;

public class Story {
    private static final String[] SCENES = {
            "You wake up in a dark forest. Do you want to go north or south?",
            "You encounter a river. Do you want to swim across or walk along the bank?",
            "You find a cave. Do you want to enter the cave or continue walking?",
    };

    private static final String[][] OPTIONS = {
            { "Go north", "Go south" },
            { "Swim across", "Walk along the bank" },
            { "Enter the cave", "Continue walking" },
    };

    private static final String[] ENDINGS = {
            "You reached a village and were rescued. Congratulations!",
            "You got lost and ran out of supplies. You died."
    };

    public String getCurrentScene(GameState gameState) {
        return SCENES[gameState.getSceneIndex()];
    }

    public String[] getOptions(GameState gameState) {
        return OPTIONS[gameState.getSceneIndex()];
    }

    public void makeChoice(GameState gameState, int choice) {
        switch (gameState.getSceneIndex()) {
            case 0:
                if (choice == 1) {
                    gameState.setSceneIndex(1);
                } else {
                    gameState.setSceneIndex(2);
                }
                break;
            case 1:
                if (choice == 1) {
                    gameState.setGameOver(true);
                    gameState.setEndingMessage(ENDINGS[1]);
                } else {
                    gameState.setSceneIndex(2);
                }
                break;
            case 2:
                if (choice == 1) {
                    gameState.setGameOver(true);
                    gameState.setEndingMessage(ENDINGS[0]);
                } else {
                    gameState.setGameOver(true);
                    gameState.setEndingMessage(ENDINGS[1]);
                }
                break;
        }
    }
}
