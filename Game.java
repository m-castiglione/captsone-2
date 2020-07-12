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

        JLabel enemyHealth = new JLabel("Enemy Health: " + chosenEnemy.health);
        enemyHealthPanel.add(enemyHealth);

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
                playerAttack(chosenHero);
            }
        });

        magicBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerMagicAttack(chosenHero);
            }
        });

        

        this.getContentPane().add(enemyHealthPanel, BorderLayout.NORTH);
        this.getContentPane().add(enemyPanel, BorderLayout.CENTER);
        this.getContentPane().add(playerActionsPanel, BorderLayout.SOUTH);
    }

    public void playerMagicAttack(Hero hero) {
        switch (hero.name) {
            case "Warrior of Light":
                JOptionPane.showMessageDialog(null, "Calling upon the light, you cast Holy and it smites you enemy with "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Firion":
                JOptionPane.showMessageDialog(null, "By pulling out a magical scepter, you cast Blizzard and it deals "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Onion Knight":
                JOptionPane.showMessageDialog(null, "Changing you job to Mage, you cast Fira and it burns your opponent by "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Cecil":
                JOptionPane.showMessageDialog(null, "You change your job to Paladin and cast Holy. Its majestic lights pierces the enemy by "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Bartz":
                JOptionPane.showMessageDialog(null, "You change your job to Wizard and cast Firaga! It burns your enemy by ");
                enemyAttack(chosenEnemy);
                break;
            case "Terra":
                JOptionPane.showMessageDialog(null, "You cast Blizzaga and a massive shard of ice is thrown to your enemy dealing ");
                enemyAttack(chosenEnemy);
                break;
            case "Cloud":
                JOptionPane.showMessageDialog(null, "You use your Fire Materia and cast Fire. It scalds your enemy by ");
                enemyAttack(chosenEnemy);
                break;
            case "Squall":
                JOptionPane.showMessageDialog(null, "You load your gunblade and shoot fire! It burns your enemy by ");
                enemyAttack(chosenEnemy);
                break;
            case "Zidane":
                JOptionPane.showMessageDialog(null, "Connecting your twin blades to a bladed polearm, your twirl it around and cast Aero! It blows your opponent and deals ");
                enemyAttack(chosenEnemy);
                break;
            case "Tidus":
                JOptionPane.showMessageDialog(null, "You cast Waterga! A huge current washes away the enemy causing ");
                enemyAttack(chosenEnemy);
                break;
            case "Shantotto":
                JOptionPane.showMessageDialog(null, "You strike your rod down to the ground and cast Meteor! Meteors fall down and smash your enemy dealing ");
                enemyAttack(chosenEnemy);
                break;
            case "Vaan":
                JOptionPane.showMessageDialog(null, "You send a volley of fire balls as you cast Fire! It burns your enemy by ");
                enemyAttack(chosenEnemy);
                break;
            case "Lightning":
                JOptionPane.showMessageDialog(null, "You call upon your Il'Ce and cast Thundaga! Lightning rains down and shocks your enemy by ");
                enemyAttack(chosenEnemy);
                break;
            case "Cid":
                JOptionPane.showMessageDialog(null, "You cast Thunder! You shock your opponent by ");
                enemyAttack(chosenEnemy);
                break;
            case "Noctis":
                JOptionPane.showMessageDialog(null, "You throw and orb and a combination of fire and lightning is called upon. You deal ");
                enemyAttack(chosenEnemy);
                break;
        }
    }

    public void playerAttack(Hero hero) {
        switch(hero.name) {
            case "Warrior of Light":
                JOptionPane.showMessageDialog(null, "Using the mystical light as your guide, your sword slashes the enemy for a damage of "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Firion":
                JOptionPane.showMessageDialog(null, "Using your arsenal of weapons, you pull out your trusty bow and shoot an arrow at the enemy for a damage of "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Onion Knight":
                JOptionPane.showMessageDialog(null, "Calling upon the wisdom and courage of the Knight job, you use your short sword to slash the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Cecil":
                JOptionPane.showMessageDialog(null, "Using your Dark Knight aura, you stab the enemy with your dark polearm causing "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Bartz":
                JOptionPane.showMessageDialog(null, "Changing to your Beast Tamer job, you take a ride from a Chocobo and with your sword in hand, slash the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Terra":
                JOptionPane.showMessageDialog(null, "With your enchanted sabre in hand, you do a magical slash to the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Cloud":
                JOptionPane.showMessageDialog(null, "With your massive Buster Sword, your cleave into the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Squall":
                JOptionPane.showMessageDialog(null, "Using your gunblade, you slash at the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Zidane":
                JOptionPane.showMessageDialog(null, "Using your twin blades, you leap into the air and do flip, then slashing your enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Tidus":
                JOptionPane.showMessageDialog(null, "Using your blade, Brotherhood, you take a leap into the air and do a curved slash dealing "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Shantotto":
                JOptionPane.showMessageDialog(null, "Using your magical rod, you swat at the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Vaan":
                JOptionPane.showMessageDialog(null, "Using a schimtar, you slice the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Lightning":
                JOptionPane.showMessageDialog(null, "Using your sabre, you do a flurry of attacks causing "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Cid":
                JOptionPane.showMessageDialog(null, "Using your trusty wrench, you hit the enemy causing "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
            case "Noctis":
                JOptionPane.showMessageDialog(null, "Using your trusty Engine Blade, you strike the enemy for "); //do damage calculation
                enemyAttack(chosenEnemy);
                break;
        }
    }

    public void enemyAttack(Enemy enemy) {
        switch(enemy.name) {
            case "Tonberry":
                JOptionPane.showMessageDialog(null, "The Tonberry looks aggressive and takes a stab at you with its knife for "); //do damage calculation
                break;
            case "Cactaur":
                JOptionPane.showMessageDialog(null, "The Cactaur readies its needles and uses its signature attack 1000 Needles for "); //do damage calculation
                break;
            case "Marlboro":
                JOptionPane.showMessageDialog(null, "The Marlboro grins in a devilish manner and uses its vines to crack at you for "); //do damage calculation
                break;
            case "Flan":
                JOptionPane.showMessageDialog(null, "The Flan shoots a spray of acid at you dealing "); //do damage calculation
                break;
            case "Bomb":
                JOptionPane.showMessageDialog(null, "The Bomb charges at you with a searing heat dealing "); //do damage calculation
                break;
            case "Ogre":
                JOptionPane.showMessageDialog(null, "The Ogre cries a vicious war cry and slams his club at you for "); //do damage calculation
                break;
        }
    }
}
