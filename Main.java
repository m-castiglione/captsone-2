import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CharSelect c = new CharSelect();
        Enemy enemyPlaceholder = null;
        Hero heroPlaceholder = null;
        ImageIcon enemyPortrait = null;
        int chosenMonster = (int) ((Math.random() * (6 - 1)) + 1);

        switch (chosenMonster) {
            case 1:
                Enemy tonberry = new Enemy("Tonberry", 150, 10, 5);
                ImageIcon tonberryIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\tonberry8-b.jpg");
                enemyPlaceholder = tonberry;
                enemyPortrait = tonberryIcon;
                break;
            case 2:
                Enemy cactaur = new Enemy("Cactuar", 200, 15, 10);
                ImageIcon cactaurIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\FFRK_Cactuar_FFXIII_Boss.png");
                enemyPlaceholder = cactaur;
                enemyPortrait = cactaurIcon;
                break;
            case 3:
                Enemy marlboro = new Enemy("Marlboro", 250, 15, 10);
                ImageIcon marlboroIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\Malboro_Scan.png");
                enemyPlaceholder = marlboro;
                enemyPortrait = marlboroIcon;
                break;
            case 4:
                Enemy flan = new Enemy("Flan", 175, 15, 5);
                ImageIcon flanIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\dustin-halstex-sprite-flan-comparison-october-2nd-2014.png");
                enemyPlaceholder = flan;
                enemyPortrait = flanIcon;
                break;
            case 5:
                Enemy bomb = new Enemy("Bomb", 125, 20, 5);
                ImageIcon bombIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\FF4_PSP_Bomb_Field.png");
                enemyPlaceholder = bomb;
                enemyPortrait = bombIcon;
                break;
            case 6:
                Enemy ogre = new Enemy("Ogre", 300, 25, 15);
                ImageIcon ogreIcon = new ImageIcon("C:\\Users\\Lionscastle\\Documents\\captsone-2\\assets\\ogre-sprite.png");
                enemyPlaceholder = ogre;
                enemyPortrait = ogreIcon;
                break;
        }

        System.out.println(enemyPlaceholder.name);

        System.out.println(chosenMonster);

        switch (c.characterSelected) {
            case "Warrior of Light":
                Hero warriorOfLight = new Hero (250, 20, 20, 10);
                heroPlaceholder = warriorOfLight;
                break;
            case "Firion":
                Hero firion = new Hero(125, 15, 15, 15);
                heroPlaceholder = firion;
                break;
            case "Onion Knight":
                Hero onionKnight = new Hero(115, 15, 15, 15);
                heroPlaceholder = onionKnight;
                break;
            case "Cecil":
                Hero cecil = new Hero(225, 20, 15, 15);
                heroPlaceholder = cecil;
                break;
            case "Bartz":
                Hero bartz = new Hero(120, 15, 10, 15);
                heroPlaceholder = bartz;
                break;
            case "Terra":
                Hero terra = new Hero(115, 10, 10, 25);
                heroPlaceholder = terra;
                break;
            case "Cloud Strife":
                Hero cloud = new Hero(200, 25, 20, 15);
                heroPlaceholder = cloud;
                break;
            case "Squall Leonhart":
                Hero squall = new Hero(200, 20, 15, 15);
                heroPlaceholder = squall;
                break;
            case "Zidane Tribal":
                Hero zidane = new Hero(150, 15, 10, 15);
                heroPlaceholder = zidane;
                break;
            case "Tidus":
                Hero tidus = new Hero(175, 15, 10, 10);
                heroPlaceholder = tidus;
                break;
            case "Shantotto":
                Hero shantotto = new Hero(100, 10, 10, 30);
                heroPlaceholder = shantotto;
                break;
            case "Vaan":
                Hero vaan = new Hero(125, 15, 10, 10);
                heroPlaceholder = vaan;
                break;
            case "Lightning":
                Hero lightning = new Hero(175, 15, 15, 15);
                heroPlaceholder = lightning;
                break;
            case "Cid":
                Hero cid = new Hero(150, 20, 15, 15);
                heroPlaceholder = cid;
                break;
            case "Noctis":
                Hero noctis = new Hero(200, 20, 15, 15);
                heroPlaceholder = noctis;
                break;
        }

        Game g = new Game(heroPlaceholder, enemyPlaceholder, enemyPortrait);
    }
}
