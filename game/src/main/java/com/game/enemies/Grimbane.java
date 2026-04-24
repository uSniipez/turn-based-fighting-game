package com.game.enemies;
import com.game.Player;

public class Grimbane {

    final String grimbaneName = "Grimbane";
    private int grimbaneHP = 50;
    private int grimbaneShield = 0;
    private int grimbaneAttackDamage = 12;
    private int grimbaneDefend = 7;


    // for later use (min/max hp, damage uses shield first, etc)
    public int getGrimbaneHP() {return grimbaneHP;}
    public int getGrimbaneShield() {return grimbaneShield;}
    public int getGrimbaneAttackDamage() {return grimbaneAttackDamage;}
    public int getGrimbaneDefend() {return grimbaneDefend;}
    public void setGrimbaneHP(int grimbaneHP) {this.grimbaneHP = grimbaneHP;}
    public void setGrimbaneShield(int grimbaneShield) {this.grimbaneShield = grimbaneShield;}
    public void setGrimbaneAttackDamage(int grimbaneAttackDamage) {this.grimbaneAttackDamage = grimbaneAttackDamage;}
    public void setGrimbaneDefend(int grimbaneDefend) {this.grimbaneDefend = grimbaneDefend;}
    
    public void takeDamage(int damageSource) {
        int damage = damageSource;

        if (grimbaneShield > 0) { 
            damage = (damage - grimbaneShield);
            grimbaneShield = (grimbaneShield - damageSource);

            if (damage < 0) {damage = 0;}
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
        } else {
            System.out.println("Grimbane is attacking for " + grimbaneAttackDamage);
            player.takeDamage(grimbaneAttackDamage);
        }
    }

    public int randomTurn2() {
        double i = Math.random();
        if (i < 0.5) {
            System.out.println("Grimbane is blocking for " + grimbaneDefend);
            defend();
            return 0;
            
        } else {
            System.out.println("Grimbane is attacking for " + grimbaneAttackDamage);
            return 1;
        }
    }





















}
        










    







