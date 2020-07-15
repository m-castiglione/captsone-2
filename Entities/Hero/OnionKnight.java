package Entities.Hero;

import Entities.Entity;
import Entities.SpecialEntity;

import javax.swing.*;

public class OnionKnight implements Entity, SpecialEntity {
    public String name = "Onion Knight";
    public int health = 115 ;
    public int strength = 15;
    public int defense = 15;
    public int magic = 15;

    @Override
    public int attack(int health) {
        JOptionPane.showMessageDialog(null, "Calling upon the wisdom and courage of the Knight job, you use your short sword to slash the enemy for " + strength * 2 + " damage"); //do damage calculation
        health -= strength * 2;
        return health;
    }

    @Override
    public void defend() {

    }

    @Override
    public int magicAttack(int enemyHealth) {
        JOptionPane.showMessageDialog(null, "Changing you job to Mage, you cast Fira and it burns your opponent by " + magic * 2);
        enemyHealth -= magic * 2;
        return enemyHealth;
    }

    @Override
    public void specialAttack() {

    }
    //"Onion Knight", 115, 15, 15, 15
}
