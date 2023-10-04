package TikTakToe;

import javax.swing.*;

public class GameFrame extends JFrame {
    
    public GameFrame() {
        Game game = new Game();

        add(game);

        pack();
    }
}
