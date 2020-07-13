package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Tidus implements Entity, SpecialEntity {
    public String name = "Tidus";
    public int health = 175 ;
    public int strength = 15;
    public int defense = 10;
    public int magic = 10;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your blade, Brotherhood, you take a leap into the air and do a curved slash dealing " + strength * 2 + " damage");
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You cast Waterga! A huge current washes away the enemy causing " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
} //175, 15, 10, 10
