package TikTakToe;

import java.awt.*;

public class tiktaktoe {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GameFrame frame = new GameFrame();

            frame.setTitle("TikTakToe");
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setSize(250, 250);
            frame.setVisible(true);
        });
    }
}
