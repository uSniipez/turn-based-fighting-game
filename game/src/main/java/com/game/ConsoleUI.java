package com.game;
import com.game.enemies.Grimbane;
import java.util.Scanner;



public class ConsoleUI {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player();
    Grimbane grimbane = new Grimbane();
    
    private int getSelection;
    public ConsoleUI() {    
    }

    public void consoleUI() {
        System.out.println("-Turn Based Fighting Game-" + "\n");
        System.out.println("Level One 'Grimbane'");
        System.out.println("HP: " + grimbane.getGrimbaneHP() + " | Shield: " + grimbane.getGrimbaneShield());
        System.out.println("Grimbane is attacking for " + grimbane.getGrimbaneAttackDamage() + "\n");

        System.out.println("Choose an action:");
        System.out.println("(1). Attack for " + player.getPlayerAttackDamage());
        System.out.println("(2). Defend for " + player.getPlayerDefense());

    }
}


