package com.game;
import java.util.Scanner;

import com.game.enemies.Grimbane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleUI ui = new ConsoleUI();
        Player player = new Player();
        Grimbane grimbane = new Grimbane();
        Combat combat = new Combat();
        GameEngine gameEngine = new GameEngine();

        //ui.consoleUI();
        gameEngine.startGame();
       // gameEngine.grimbaneFight();
    }
}