package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Bartz implements Entity, SpecialEntity {
    public String name = "Bartz";
    public int health = 120;
    public int strength = 15;
    public int defense = 10;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your arsenal of weapons, you pull out your trusty bow and shoot an arrow at the enemy for a damage of " + strength * 2); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You change your job to Wizard and cast Firaga! It burns your enemy by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
} // 120, 15, 10, 15
