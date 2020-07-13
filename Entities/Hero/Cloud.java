package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Cloud implements Entity, SpecialEntity {
    public String name = "Cloud";
    public int health = 200;
    public int strength = 25;
    public int defense = 20;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "With your massive Buster Sword, your cleave into the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You use your Fire Materia and cast Fire. It scalds your enemy by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    } //200, 25, 20, 15
}
