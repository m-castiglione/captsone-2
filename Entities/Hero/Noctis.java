package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Noctis implements Entity, SpecialEntity {
    public String name = "Noctis";
    public int health = 200 ;
    public int strength = 20;
    public int defense = 15;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your trusty Engine Blade, you strike the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You throw an orb and a combination of fire and lightning is called upon. You deal " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
}
