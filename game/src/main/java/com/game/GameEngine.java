package com.game;
import java.util.Scanner;
import com.game.enemies.Grimbane;

public class GameEngine {
    ConsoleUI consoleUI = new ConsoleUI();
    Player player = new Player();
    Grimbane grimbane = new Grimbane();
    Scanner scanner = new Scanner(System.in);

    int turnCounter = 1;

    public void startGame() {
        // add a way for game to know what who the current enenmy is and what turn it is on
        while (player.playerHP > 0 && grimbane.grimbaneHP > 0) {
            grimbaneFight();
        }
    }

    public void grimbaneFight() {
        System.out.println("=========================================================");
        System.out.println("Turn: " + turnCounter);
        System.out.println("Grimbane | " + "HP: " + grimbane.getGrimbaneHP() + " | Shield: " + grimbane.getGrimbaneShield());
        System.out.println("Player |" + " HP: " + player.getPlayerHP() + " | Shield: " + player.getPlayerShield() + "\n");
        
        grimbane.randomTurn(player);
        System.out.println("=========================================================");
        
        
        consoleUI.chooseAction();
        String userInput = scanner.nextLine();
        
        if (userInput.equals("1")) {
            grimbane.takeDamage(player.playerAttackDamage);
            System.out.println("You attacked Grimbane for " + player.playerAttackDamage);
        } else if (userInput.equals("2")) {
            player.defend();
            System.out.println("You defended Grimbane for " + player.playerDefend);
        } else{
            System.out.println("Invalid input, try again!" + "\n");
        }
  
    }
}
