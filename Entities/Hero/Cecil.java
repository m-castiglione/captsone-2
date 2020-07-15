package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Cecil implements Entity, SpecialEntity {
    public String name = "Cecil";
    public int health = 225;
    public int strength = 20;
    public int defense = 15;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your Dark Knight aura, you stab the enemy with your dark polearm causing " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You change your job to Paladin and cast Holy. Its majestic lights pierces the enemy by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    } //225, 20, 15, 15)
}
