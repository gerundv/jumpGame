import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        setTitle("jumpGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocation(400,400);
        add(new gameWindow());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main mainWindow = new Main();
    }
}