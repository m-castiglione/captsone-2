package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class WarriorOfLight implements Entity, SpecialEntity {
    public String name = "Warrior of Light";
    public int health = 250 ;
    public int strength = 20;
    public int defense = 25;
    public int magic = 10;

    //"Warrior of Light", 250, 20, 20, 10

    @Override
    public int attack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "Using the mystical light as your guide, your sword slashes the enemy for a damage of " + strength * 2); //do damage calculation
        enemyHealth -= strength * 2;
        return enemyHealth;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "Calling upon the light, you cast Holy and it smites you enemy with " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
}
