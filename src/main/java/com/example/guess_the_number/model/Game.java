package com.example.guess_the_number.model;

import java.util.Random;

public class Game {
    private int numberToGuess;
    private int attempts;
    private boolean started;

    public void startNewGame(int upperBound) {
        numberToGuess = new Random().nextInt(upperBound) + 1;
        attempts = 0;
        started = true;
    }

    public String checkGuess(int guess) {
        attempts++;
        if (guess < numberToGuess) return "🔻 Too low!";
        else if (guess > numberToGuess) return "🔺 Too high!";
        else {
            started = false;
            return "🎉 Correct! You guessed it in " + attempts + " attempts.";
        }
    }

    public boolean isStarted() {
        return started;
    }
}
