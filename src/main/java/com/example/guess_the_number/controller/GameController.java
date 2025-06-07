package com.example.guess_the_number.controller;

import com.example.guess_the_number.model.Game;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @PostMapping("/start")
    public ResponseEntity<String> startGame(@RequestParam String level, HttpSession session) {
        int upperLimit = switch (level.toLowerCase()) {
            case "easy" -> 50;
            case "medium" -> 100;
            case "hard" -> 200;
            default -> 0;
        };

        if (upperLimit == 0) return ResponseEntity.badRequest().body("Invalid difficulty level.");

        Game game = new Game();
        game.startNewGame(upperLimit);
        session.setAttribute("game", game);

        return ResponseEntity.ok("✅ Game started! Guess a number between 1 and " + upperLimit);
    }

    @PostMapping("/guess")
    public ResponseEntity<String> makeGuess(@RequestParam int guess, HttpSession session) {
        Game game = (Game) session.getAttribute("game");

        if (game == null || !game.isStarted()) {
            return ResponseEntity.badRequest().body("❗ Start the game first.");
        }

        return ResponseEntity.ok(game.checkGuess(guess));
    }
}
