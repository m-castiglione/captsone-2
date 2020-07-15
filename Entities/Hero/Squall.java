package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Squall implements Entity, SpecialEntity {
    public String name = "Squall";
    public int health = 200 ;
    public int strength = 20;
    public int defense = 15;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your gunblade, you slash at the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You load your gunblade and shoot fire! It burns your enemy by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
} //200, 20, 15, 15
