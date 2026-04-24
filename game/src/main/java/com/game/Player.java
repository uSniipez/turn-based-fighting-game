package com.game;

public class Player {
    private int playerHP = 50;
    private int playerShield = 0;
    private int playerAttackDamage = 10;
    public int playerDefend = 8;

    public int getPlayerHP() {return playerHP;}
    public int getPlayerShield() {return playerShield;}
    public int getPlayerAttackDamage() {return playerAttackDamage;}
    public int getPlayerDefend() {return playerDefend;}
    public void setPlayerHP(int playerHP) {this.playerHP = playerHP;}
    public void setPlayerShield(int playerShield) {this.playerShield = playerShield;}
    public void setPlayerAttackDamage(int playerAttackDamage) {this.playerAttackDamage = playerAttackDamage;}
    public void setPlayerDefend(int playerDefend) {this.playerDefend = playerDefend;}
    
    public void takeDamage(int damageSource) {     
        int damage = damageSource;

        if (playerShield > 0) { 
            damage = (damage - playerShield);
            playerShield = (playerShield - damageSource);

            if (damage < 0) {damage = 0;}
            if (playerShield < 0) {playerShield = 0;}
        }
        
        if (playerHP - damage <= 0) {
            System.out.println("Game Over!");
            System.out.println("You have been defeated.");
            System.exit(0);
        }
        setPlayerHP(playerHP - damage); 
    }
    
    public void defend () {
        playerShield = (playerShield + playerDefend);
    }
}


