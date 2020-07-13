package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Cid implements Entity, SpecialEntity {
    public String name = "Cid";
    public int health = 150;
    public int strength = 20;
    public int defense = 15;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your trusty wrench, you hit the enemy causing " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You cast Thunder! You shock your opponent by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
} //150, 20, 15, 15
