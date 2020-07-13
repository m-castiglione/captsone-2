import Entities.Enemy.Enemy;
import Entities.Hero.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    public Hero chosenHero;
    public Enemy chosenEnemy;
    public ImageIcon enemyPortrait;

    public Game(Hero chosenHero, Enemy chosenEnemy, ImageIcon enemyPortrait) {
        this.chosenHero = chosenHero;
        this.chosenEnemy = chosenEnemy;
        this.enemyPortrait = enemyPortrait;

        setSize(600, 400);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel enemyHealthPanel = new JPanel();
        JPanel enemyPanel = new JPanel();
        JPanel playerActionsPanel = new JPanel();
        //JPanel playerInfoPanel = new JPanel();

        JButton enemyPic = new JButton(enemyPortrait);
        enemyPanel.add(enemyPic);

        JLabel enemyHealthLabel = new JLabel("Enemy Health: " + chosenEnemy.health);
        enemyHealthPanel.add(enemyHealthLabel);

        JButton attackBtn = new JButton("Attack");
        JButton magicBtn = new JButton("Magic");
        JButton specialBtn = new JButton("Special");
        JButton defendBtn = new JButton("Defend");

        playerActionsPanel.add(attackBtn);
        playerActionsPanel.add(magicBtn);
        playerActionsPanel.add(specialBtn);
        playerActionsPanel.add(defendBtn);

        JMenuBar menuBar = new JMenuBar();
        JMenu statsMenu = new JMenu("Stats");
        JMenuItem playerStatsButton = new JMenuItem("Player Stats");
        JMenuItem enemyStatsButton = new JMenuItem("Enemy Stats");

        menuBar.add(statsMenu);
        statsMenu.add(playerStatsButton);
        statsMenu.add(enemyStatsButton);

        setJMenuBar(menuBar);
        
        playerStatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your Health: " + chosenHero.health +
                "\nYour Strength: " + chosenHero.strength + "\nYour Magic: " + chosenHero.magic + "\nYour Defense: " + chosenHero.defense);
            }
        });

        enemyStatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Enemy Name: " + chosenEnemy.name +
                        "\nEnemy Strength: " + chosenEnemy.strength + "\nEnemy Defense: " + chosenEnemy.defense);
            }
        });

        attackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAttack(chosenHero, enemyHealthLabel);
            }
        });

        magicBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerMagicAttack(chosenHero, enemyHealthLabel);
            }
        });

        defendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerDefend();
            }
        });

        specialBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chosenHero.health <= chosenHero.health / 4) {
                    playerSpecialAttack(chosenHero, enemyHealthLabel);
                } else {
                    JOptionPane.showMessageDialog(null, "You haven't hit your limit break yet.");
                }
            }
        });

        this.getContentPane().add(enemyHealthPanel, BorderLayout.NORTH);
        this.getContentPane().add(enemyPanel, BorderLayout.CENTER);
        this.getContentPane().add(playerActionsPanel, BorderLayout.SOUTH);
    }

    public void playerMagicAttack(Hero hero, JLabel enemyHealthLabel) {
        switch (hero.name) {
            case "Warrior of Light":
                WarriorOfLight warriorOfLight = new WarriorOfLight();
                int enemyHealth = warriorOfLight.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Firion":
                Firion firion = new Firion();
                enemyHealth = firion.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Onion Knight":
                OnionKnight onionKnight = new OnionKnight();
                enemyHealth = onionKnight.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Cecil":
                Cecil cecil = new Cecil();
                enemyHealth = cecil.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Bartz":
                Bartz bartz = new Bartz();
                enemyHealth = bartz.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Terra":
                Terra terra = new Terra();
                enemyHealth = terra.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Cloud":
                Cloud cloud = new Cloud();
                enemyHealth = cloud.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Squall":
                Squall squall = new Squall();
                enemyHealth = squall.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Zidane":
                Zidane zidane = new Zidane();
                enemyHealth = zidane.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Tidus":
                Tidus tidus = new Tidus();
                enemyHealth = tidus.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Shantotto":
                Shantotto shantotto = new Shantotto();
                enemyHealth = shantotto.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Vaan":
                Vaan vaan = new Vaan();
                enemyHealth = vaan.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Lightning":
                Lightning lightning = new Lightning();
                enemyHealth = lightning.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Cid":
                Cid cid  = new Cid();
                enemyHealth = cid.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                break;
            case "Noctis":
                Noctis noctis = new Noctis();
                enemyHealth = noctis.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.magic * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(chosenHero.health, enemyHealth);
                break;
        }
    }

    public void playerAttack(Hero hero, JLabel enemyHealthLabel) {
        switch(hero.name) {
            case "Warrior of Light":
                WarriorOfLight warriorOfLight = new WarriorOfLight();
                int enemyHealth = warriorOfLight.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(warriorOfLight.health, enemyHealth);
                break;
            case "Firion":
                Firion firion = new Firion();
                enemyHealth = firion.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(firion.health, enemyHealth);
                break;
            case "Onion Knight":
                OnionKnight onionKnight = new OnionKnight();
                enemyHealth = onionKnight.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(onionKnight.health, enemyHealth);
                break;
            case "Cecil":
                Cecil cecil = new Cecil();
                enemyHealth = cecil.magicAttack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(cecil.health, enemyHealth);
                break;
            case "Bartz":
                Bartz bartz = new Bartz();
                enemyHealth = bartz.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(bartz.health, enemyHealth);
                break;
            case "Terra":
                Terra terra = new Terra();
                enemyHealth = terra.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(terra.health, enemyHealth);
                break;
            case "Cloud":
                Cloud cloud = new Cloud();
                enemyHealth = cloud.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(cloud.health, enemyHealth);
                break;
            case "Squall":
                Squall squall = new Squall();
                enemyHealth = squall.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(squall.health, enemyHealth);
                break;
            case "Zidane":
                Zidane zidane = new Zidane();
                enemyHealth = zidane.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(zidane.health, enemyHealth);
                break;
            case "Tidus":
                Tidus tidus = new Tidus();
                enemyHealth = tidus.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(tidus.health, enemyHealth);
                break;
            case "Shantotto":
                Shantotto shantotto = new Shantotto();
                enemyHealth = shantotto.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(shantotto.health, enemyHealth);
                break;
            case "Vaan":
                Vaan vaan = new Vaan();
                enemyHealth = vaan.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(vaan.health, enemyHealth);
                break;
            case "Lightning":
                Lightning lightning = new Lightning();
                enemyHealth = lightning.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(lightning.health, enemyHealth);
                break;
            case "Cid":
                Cid cid = new Cid();
                enemyHealth = cid.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(cid.health, enemyHealth);
                break;
            case "Noctis":
                Noctis noctis = new Noctis();
                enemyHealth = noctis.attack(chosenEnemy.health);
                chosenEnemy.health -= chosenHero.strength * 2;
                enemyHealthLabel.setText("Enemy Health: " + enemyHealth);
                enemyAttack(chosenEnemy);
                checkEndGame(noctis.health, enemyHealth);
                break;
        }
    }

    public void enemyAttack(Enemy enemy) {
        switch(enemy.name) {
            case "Tonberry":
                JOptionPane.showMessageDialog(null, "The Tonberry looks aggressive and takes a stab at you with its knife for " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
            case "Cactuar":
                JOptionPane.showMessageDialog(null, "The Cactaur readies its needles and uses its signature attack 1000 Needles for " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
            case "Marlboro":
                JOptionPane.showMessageDialog(null, "The Marlboro grins in a devilish manner and uses its vines to crack at you for " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
            case "Flan":
                JOptionPane.showMessageDialog(null, "The Flan shoots a spray of acid at you dealing " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
            case "Bomb":
                JOptionPane.showMessageDialog(null, "The Bomb charges at you with a searing heat dealing " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
            case "Ogre":
                JOptionPane.showMessageDialog(null, "The Ogre cries a vicious war cry and slams his club at you for " + chosenEnemy.strength * 2 + " damage"); //do damage calculation
                chosenHero.health -= chosenEnemy.strength * 2;
                break;
        }
    }

    public void playerDefend() {
        JOptionPane.showMessageDialog(null, "As you brace yourself, you take reduced damage. You take " + chosenEnemy.strength + " damage");//do damage calculation
        chosenHero.health -= chosenEnemy.strength;
    }

    public void playerSpecialAttack(Hero hero, JLabel enemyHealth) {
        switch(hero.name) {
            case "Warrior of Light":
                JOptionPane.showMessageDialog(null, "By calling upon the Light, you slash a Holy Cross dealing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Firion":
                JOptionPane.showMessageDialog(null, "Using your arsenal of weapons, you pull out your Greater Lightning Rod and cast Thundaga to your enemy for a damage of " + hero.strength * 3); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Onion Knight":
                JOptionPane.showMessageDialog(null, "Calling upon the wisdom and courage of the Knight job, you use your Ultimate Weapon to slash the enemy for " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Cecil":
                JOptionPane.showMessageDialog(null, "Using your Paladin's Might, you stab the enemy with your Holy polearm causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Bartz":
                JOptionPane.showMessageDialog(null, "Changing to your Beast Tamer job, you take a ride from a Chocobo and with your Chicken Knife in hand, slash the enemy for " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Terra":
                JOptionPane.showMessageDialog(null, "You use your magical might and turn into an Esper casting Aeroga! You gust away your enemy by " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Cloud":
                JOptionPane.showMessageDialog(null, "With your massive Buster Sword, your do your signature move, Omnislash, causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Squall":
                JOptionPane.showMessageDialog(null, "Using your gunblade, you do a Grand Slash at the enemy for " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Zidane":
                JOptionPane.showMessageDialog(null, "You enter into an aggressive Trance and attack the enemy causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Tidus":
                JOptionPane.showMessageDialog(null, "Using your Blitzball skills, you launch a Blitzball causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Shantotto":
                JOptionPane.showMessageDialog(null, "Using your magical rod, you cast Greater Meteor! Doing a total damage of " + hero.strength * 3); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Vaan":
                JOptionPane.showMessageDialog(null, "Using a schimtar and flame, you slice with a fiery attack dealing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Lightning":
                JOptionPane.showMessageDialog(null, "You call upon Odin, slicing the enemy down by " + hero.strength * 3); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Cid":
                JOptionPane.showMessageDialog(null, "After calling your Magitek Armor, you shoot a Fira Laser at your enemy causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
            case "Noctis":
                JOptionPane.showMessageDialog(null, "Using the royal armory and the Amiger system, you warp strike into your enemy causing " + hero.strength * 3 + " damage"); //do damage calculation
                chosenEnemy.health -= hero.strength * 3;
                enemyHealth.setText("Enemy Health: " + chosenEnemy.health);
                enemyAttack(chosenEnemy);
                break;
        }
    }

    public void checkEndGame(int heroHealth, int enemyHealth) {
        if (heroHealth <= 0) {
            JOptionPane.showMessageDialog(null, "GAME OVER. You died.");
            System.exit(0);
        }
        if (enemyHealth <= 0) {
            JOptionPane.showMessageDialog(null, "YOU WIN!");
            System.exit(0);
        }
    }
}
