package com.example;

public class GameState {
    private int sceneIndex;
    private boolean gameOver;
    private String endingMessage;

    public GameState() {
        this.sceneIndex = 0;
        this.gameOver = false;
        this.endingMessage = "";
    }

    public int getSceneIndex() {
        return sceneIndex;
    }

    public void setSceneIndex(int sceneIndex) {
        this.sceneIndex = sceneIndex;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public String getEndingMessage() {
        return endingMessage;
    }

    public void setEndingMessage(String endingMessage) {
        this.endingMessage = endingMessage;
    }
}
