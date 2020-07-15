package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Vaan implements Entity, SpecialEntity {
    public String name = "Vaan";
    public int health = 125 ;
    public int strength = 15;
    public int defense = 10;
    public int magic = 10;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using a schimtar, you slice the enemy for " + strength * 2 + " damage");
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You send a volley of fire balls as you cast Fire! It burns your enemy by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    } //125, 15, 10, 10
}
