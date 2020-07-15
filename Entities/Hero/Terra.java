package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class Terra implements Entity, SpecialEntity {
    public String name = "Terra";
    public int health = 115 ;
    public int strength = 10;
    public int defense = 10;
    public int magic = 25;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "With your enchanted sabre in hand, you do a magical slash to the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "You cast Blizzaga and a massive shard of ice is thrown to your enemy dealing " + magic * 2 + " damage");
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
}
