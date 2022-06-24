import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class gameWindow extends JPanel implements ActionListener{

    private final int size = 1920;

    private final int heroPick = 16;

    private final int allDOTS = 1920;

    private Image hero;


    private int[] heroX = new int[allDOTS];

    private int[] heroY = new int[allDOTS];

    private int dots;

    private Timer timer;

    private boolean left = false;

    private boolean right = false;

    private boolean up = false;

    private  boolean down = false;

    private boolean inGame = true;

    public gameWindow(){
        setBackground(Color.WHITE);
        loadImages();
        initGame();
    }

    public void loadImages(){
        ImageIcon imHero = new ImageIcon("hero.png");
        hero = imHero.getImage();
    }

    public void initGame(){
        dots = 3;
        heroX[0] = 50;
        heroY[0] = 700;
        timer = new Timer(250, this);
        timer.start();
        createPlatform();
    }

    public void createPlatform(){

    }

    public void checkCollisions(){

    }

    public void move(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame){
            g.drawImage(hero,heroX[0],heroY[0],this);

        }
        else {
            String str = "YOU DIED";
            g.setColor(Color.red);
            g.drawString(str,200,size/2 - 40);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkCollisions();
            move();
        }
        repaint();
    }

}
