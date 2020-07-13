package Entities.Enemy;

public class Enemy {
    public String name;
    public int health;
    public int strength;
    public int defense;

    public Enemy(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }
}
