package com.game.enemies;
import com.game.Player;

public class Grimbane {

    final String grimbaneName = "Grimbane";
    public int grimbaneHP = 50;
    public int grimbaneShield = 0;
    public int grimbaneAttackDamage = 5;
    public int grimbaneDefend = 7;


    // for later use (min/max hp, damage uses shield first, etc)
    public int getGrimbaneHP() {return grimbaneHP;}
    public int getGrimbaneShield() {return grimbaneShield;}
    public int getGrimbaneAttackDamage() {return grimbaneAttackDamage;}
    public int getGrimbaneDefend() {return grimbaneDefend;}


    public void takeDamage(int damageSource) {
        int damage = damageSource;

        if (grimbaneShield > 0) { 
            damage = (damage - grimbaneShield);
            grimbaneShield = (grimbaneShield - damageSource);
            if (grimbaneShield < 0) {grimbaneShield = 0;}
        }
        
        if (grimbaneHP - damage <= 0) {
            System.out.println("You win! Grimbane has been slain.");
            System.exit(0);
        }
            
        grimbaneHP = (grimbaneHP - damage);   
    }
    
    public void defend () {
        grimbaneShield = (grimbaneShield + grimbaneDefend);
    }

    public void randomTurn(Player player) {
        double i = Math.random();
        if (i < 0.5) {
            defend();
            System.out.println("Grimbane is blocking for " + grimbaneDefend);
        }else{
            System.out.println("Grimbane is attacking for " + grimbaneAttackDamage);
            player.takeDamage(grimbaneAttackDamage);
        }
    }





















}
        










    







