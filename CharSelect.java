import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharSelect extends JFrame {
    public String characterSelected = "";

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

        wol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Warrior of Light";
                setVisible(false);
            }
        });

        firion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Firion";
                setVisible(false);
            }
        });

        onionKnight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Onion Knight";
                setVisible(false);
            }
        });

        cecil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Cecil";
                setVisible(false);
            }
        });

        bartz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Bartz";
                setVisible(false);
            }
        });

        terra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Terra";
                setVisible(false);
            }
        });

        cloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Cloud Strife";
                setVisible(false);
            }
        });

        squall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Squall Leonhart";
                setVisible(false);
            }
        });

        zidane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Zidane Tribal";
                setVisible(false);
            }
        });

        tidus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Tidus";
                setVisible(false);
            }
        });

        shantotto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Shantotto";
                setVisible(false);
            }
        });

        vaan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Vaan";
            }
        });

        lightining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Lightning";
            }
        });

        cid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Cid";
            }
        });

        noctis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterSelected = "Noctis";
                setVisible(false);
            }
        });

        this.getContentPane().add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
