package com.game;

public class Player {
    public int playerHP = 50;
    public int playerShield = 0;
    public int playerAttackDamage = 10;
    public int playerDefend = 8;

    // for later use (min/max hp, damage uses shield first, etc)
    public int getPlayerHP() {return playerHP;}
    public int getPlayerShield() {return playerShield;}
    public int getPlayerAttackDamage() {return playerAttackDamage;}
    public int getPlayerDefend() {return playerDefend;}

    public void takeDamage(int damageSource) {
        int damage = damageSource;

        if (playerShield > 0) { 
            damage = (damage - playerShield);
            playerShield = (playerShield - damageSource);
            if (playerShield < 0) {playerShield = 0;}
        }
        
        if (playerHP - damage <= 0) {
            System.out.println("Game Over: You died");
            System.exit(0);
        }
        
        /* 
        if (damage > 0) {
            playerHP = (playerHP - damage);
            System.out.println(playerHP);
        }
        */
       
        playerHP = (playerHP - damage);   
    }
    
    public void defend () {
        playerShield = (playerShield + playerDefend);
    }
}


