package ballbrickbreaker;

import javax.swing.*;

public class MainStart {
    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setTitle("Ball Brick Breaker");
        f.setSize(708,600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        f.add(gamePanel);

    }
}
