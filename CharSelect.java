import Entities.Enemy.Enemy;
import Entities.Hero.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharSelect extends JFrame {
    Enemy enemyPlaceholder = null;
    Hero heroPlaceholder = null;
    ImageIcon enemyPortrait = null;

    public CharSelect() {
        setSize(500, 150);
        setTitle("Character Select");
        JPanel panel = new JPanel();

        Icon wolIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\transparent-sprite-warrior-of-light.png");
        Icon firionIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\FFRK_Firion_sprites.png");
        Icon onionKnightIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\Mobile - Final Fantasy Record Keeper - Onion Knight.png");

        JButton wol = new JButton("Warrior of Light");
        JButton firion = new JButton("Firion");
        JButton onionKnight = new JButton("Onion Knight");
        JButton cecil = new JButton("Cecil");
        JButton bartz = new JButton("Bartz");
        JButton terra = new JButton("Terra");
        JButton cloud = new JButton("Cloud Strife");
        JButton squall = new JButton("Squall Leonhart");
        JButton zidane = new JButton("Zidane Tribal");
        JButton tidus = new JButton("Tidus");
        JButton shantotto = new JButton("Shantotto");
        JButton vaan = new JButton("Vaan");
        JButton lightining = new JButton("Lightning");
        JButton cid = new JButton("Cid");
        JButton noctis = new JButton("Noctis");

        JMenuBar menuBar = new JMenuBar();
        JMenu instructionsMenu = new JMenu("Instructions");
        JMenuItem instructionsButton = new JMenuItem("Instructions");

        menuBar.add(instructionsMenu);
        instructionsMenu.add(instructionsButton);

        setJMenuBar(menuBar);

        instructionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "\n" +
                        "You start out with a character select screen by having 15 characters that represent the 15 main line Final Fantasy games.\n" +
                        "Each character has their own stats, attacks, magic, limit breaker, and defensive moves. You are then thrown into an encounter\n" +
                        "with a monster that are staple within the Final Fantasy franchise. You can check the stats in the menu bar or read these instructions.\n" +
                        "From here, you fight the monster to either defeat it or have it defeat you. If your health comes lower than 25%, you can use your special attack.");
            }
        });

        panel.add(wol);
        panel.add(firion);
        panel.add(onionKnight);
        panel.add(cecil);
        panel.add(bartz);
        panel.add(terra);
        panel.add(cloud);
        panel.add(squall);
        panel.add(zidane);
        panel.add(tidus);
        panel.add(shantotto);
        panel.add(vaan);
        panel.add(lightining);
        panel.add(cid);
        panel.add(noctis);


        int chosenMonster = (int) ((Math.random() * (7 - 1)) + 1);

        switch (chosenMonster) {
            case 1:
                Enemy tonberry = new Enemy("Tonberry", 150, 10, 5);
                ImageIcon tonberryIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\tonberry8-b.jpg");
                enemyPlaceholder = tonberry;
                enemyPortrait = tonberryIcon;
                break;
            case 2:
                Enemy cactaur = new Enemy("Cactuar", 200, 15, 10);
                ImageIcon cactaurIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\FFRK_Cactuar_FFXIII_Boss.jpg");
                enemyPlaceholder = cactaur;
                enemyPortrait = cactaurIcon;
                break;
            case 3:
                Enemy marlboro = new Enemy("Marlboro", 250, 15, 10);
                ImageIcon marlboroIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\Malboro_Scan.jpg");
                enemyPlaceholder = marlboro;
                enemyPortrait = marlboroIcon;
                break;
            case 4:
                Enemy flan = new Enemy("Flan", 175, 15, 5);
                ImageIcon flanIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\dustin-halstex-sprite-flan-comparison-october-2nd-2014.jpg");
                enemyPlaceholder = flan;
                enemyPortrait = flanIcon;
                break;
            case 5:
                Enemy bomb = new Enemy("Bomb", 125, 20, 5);
                ImageIcon bombIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\FF4_PSP_Bomb_Field.jpg");
                enemyPlaceholder = bomb;
                enemyPortrait = bombIcon;
                break;
            case 6:
                Enemy ogre = new Enemy("Ogre", 300, 25, 15);
                ImageIcon ogreIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\ogre-sprite.jpg");
                enemyPlaceholder = ogre;
                enemyPortrait = ogreIcon;
                break;
        }

        System.out.println(enemyPlaceholder.name);

        System.out.println(chosenMonster);

        wol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero warriorOfLight = new Hero ("Warrior of Light", 250, 20, 20, 10);
                heroPlaceholder = warriorOfLight;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        firion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero firion = new Hero("Firion", 125, 15, 15, 15);
                heroPlaceholder = firion;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        onionKnight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero onionKnight = new Hero("Onion Knight", 115, 15, 15, 15);
                heroPlaceholder = onionKnight;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        cecil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero cecil = new Hero("Cecil",225, 20, 15, 15);
                heroPlaceholder = cecil;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        bartz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero bartz = new Hero("Bartz",120, 15, 10, 15);
                heroPlaceholder = bartz;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        terra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero terra = new Hero("Terra",115, 10, 10, 25);
                heroPlaceholder = terra;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        cloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero cloud = new Hero("Cloud", 200, 25, 20, 15);
                heroPlaceholder = cloud;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        squall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero squall = new Hero("Squall", 200, 20, 15, 15);
                heroPlaceholder = squall;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        zidane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero zidane = new Hero("Zidane", 150, 15, 10, 15);
                heroPlaceholder = zidane;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        tidus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero tidus = new Hero("Tidus", 175, 15, 10, 10);
                heroPlaceholder = tidus;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        shantotto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero shantotto = new Hero("Shantotto", 100, 10, 10, 30);
                heroPlaceholder = shantotto;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        vaan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero vaan = new Hero("Vaan",125, 15, 10, 10);
                heroPlaceholder = vaan;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        lightining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero lightning = new Hero("Lightning", 175, 15, 15, 15);
                heroPlaceholder = lightning;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        cid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero cid = new Hero("Cid", 150, 20, 15, 15);
                heroPlaceholder = cid;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        noctis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hero noctis = new Hero("Noctis", 200, 20, 15, 15);
                heroPlaceholder = noctis;
                setVisible(false);
                Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
            }
        });

        this.getContentPane().add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
