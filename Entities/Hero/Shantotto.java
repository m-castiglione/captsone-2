package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Shantotto implements Entity, SpecialEntity {
    public String name = "Shantotto";
    public int health = 100 ;
    public int strength = 10;
    public int defense = 10;
    public int magic = 30;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Using your magical rod, you swat at the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You strike your rod down to the ground and cast Meteor! Meteors fall down and smash your enemy dealing " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
} //100, 10, 10, 30
