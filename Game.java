import javax.swing.*;

public class Game extends JFrame {
    public Hero chosenHero;
    public Enemy chosenEnemy;
    public ImageIcon enemyPortrait;

    public Game(Hero chosenHero, Enemy chosenEnemy, ImageIcon enemyPortrait) {
        this.chosenHero = chosenHero;
        this.chosenEnemy = chosenEnemy;
        this.enemyPortrait = enemyPortrait;

        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel enemyPanel = new JPanel();

    }


}
