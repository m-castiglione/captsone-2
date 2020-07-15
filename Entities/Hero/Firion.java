package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Firion implements Entity, SpecialEntity {
    public String name = "Firion";
    public int health = 125;
    public int strength = 15;
    public int defense = 15;
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
        JOptionPane.showMessageDialog(null, "By pulling out a magical scepter, you cast Blizzard and it deals " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }

    //"Firion", 125, 15, 15, 15
}
