package TikTakToe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Game extends Jcomponent{

    private static JButton[][]      tombol;
    private GridLayout              layout;
    private int                     kotak;
    private int                     pemain;
    private int                     klik;
    public JLabel overLabel;

    public Game(){
            pemain = 1;
            kotak = 3;
            klik = 9;
            gameOver = false;
            layout = new GridLayout(3, 3);
            tombol = new JButton[kotak][kotak];
            
            setLayout(layout);


            for(int i = 0; i < kotak; i++){
                    for(int j = 0; j < kotak; j++) {
                        tombol[i][j] = new JButton("  ");
                        add(tombol[i][j]);
                        tombol[i][j].addMouseListener(new klik(tombol[i][j]));
                    }                
            }
    }

    private void setLayout(GridLayout layout2) {
}

private void add(JButton jButton) {
}

private class klik extends MouseAdapter {
        JButton                 tombol;
        Font                    font;

        public klik(JButton tombol) {
                font = new Font("monospaced", Font.BOLD, 30 );
                this.tombol = tombol;
                tombol.setFont(font);
        }


        public void mouseClicked(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1) {
                        if(tombol.isEnabled() == false) {
                                return;
                        }
                        if(pemain == 1) {
                                tombol.setText("X");
                                pemain = 2;
                                tombol.setEnabled(false);
                                klik --;
                                System.out.println(klik);
                                if(checkXWin()) {
                                        disable();
                                }
                                return;
                        }
                        if(pemain == 2); {
                                tombol.setText("O");
                                pemain = 1;
                                tombol.setEnabled(false);
                                klik --;
                                if(checkOWin()); {
                                        disable();
                                }
                                return;
                        }
                }
        }
    }

    public static boolean checkXWin() {

                 if((tombol[0][0].getText() == "X")
                                 &&(tombol[1][0].getText() == "X")
                                 &&(tombol[2][0].getText() == "X")){
                        tombol[0][0].setBackground(Color.blue);
                        tombol[1][0].setBackground(Color.blue);
                        tombol[2][0].setBackground(Color.blue);
                        return true;

        }else if((tombol[0][0].getText() == "X")
                                &&(tombol[1][1].getText() == "X")
                                &&(tombol[2][2].getText() == "X")) {
                        tombol[0][0].setBackground(Color.blue);
                        tombol[1][1].setBackground(Color.blue);
                        tombol[2][2].setBackground(Color.blue);
                        return true;
                
        }else if((tombol[0][0].getText() == "X")
                                &&(tombol[0][1].getText() == "X")
                                &&(tombol[0][2].getText() == "X")) {
                        tombol[0][0].setBackground(Color.blue);
                        tombol[0][1].setBackground(Color.blue);
                        tombol[0][2].setBackground(Color.blue);
                        return true;
                        
        }else if((tombol[2][0].getText() == "X")
                                &&(tombol[2][1].getText() == "X")
                                &&(tombol[2][2].getText() == "X")) {
                        tombol[2][0].setBackground(Color.blue);
                        tombol[2][1].setBackground(Color.blue);
                        tombol[2][2].setBackground(Color.blue);
                        return true;
                        
        }else if((tombol[0][1].getText() == "X")
                                &&(tombol[1][1].getText() == "X")
                                &&(tombol[2][1].getText() == "X")) {
                        tombol[0][1].setBackground(Color.blue);
                        tombol[1][1].setBackground(Color.blue);
                        tombol[2][1].setBackground(Color.blue);
                        return true;

        }else if ((tombol[0][2].getText() == "X")
                                &&(tombol[1][2].getText() == "X")
                                &&(tombol[2][2].getText() == "X")) {
                        tombol[0][2].setBackground(Color.blue);
                        tombol[1][2].setBackground(Color.blue);
                        tombol[2][2].setBackground(Color.blue);
                        return true;
        
        }else if ((tombol[0][2].getText() == "X")
                                &&(tombol[1][1].getText() == "X")
                                &&(tombol[2][0].getText() == "X")) {
                        tombol[0][2].setBackground(Color.blue);
                        tombol[1][1].setBackground(Color.blue);
                        tombol[2][3].setBackground(Color.blue);
                        return true;
        }
        return false;
    }

    public static boolean checkOWin() {

                 if((tombol[0][0].getText() == "O")
                                &&(tombol[1][0].getText() == "O")
                                &&(tombol[2][0].getText() == "O")) {
                        tombol[0][0].setBackground(Color.white);
                        tombol[1][0].setBackground(Color.white);
                        tombol[2][0].setBackground(Color.white);
                        return true;

        }else if((tombol[0][0].getText() == "O")
                                &&(tombol[1][1].getText() == "O")
                                &&(tombol[2][2].getText() == "O")) {
                        tombol[0][0].setBackground(Color.white);
                        tombol[1][1].setBackground(Color.white);
                        tombol[2][2].setBackground(Color.white);
                        return true;

        }else if((tombol[0][0].getText() == "O")
                                &&(tombol[0][1].getText() == "O")
                                &&(tombol[0][2].getText() == "O")) {
                        tombol[0][0].setBackground(Color.white);
                        tombol[0][1].setBackground(Color.white);
                        tombol[0][2].setBackground(Color.white);
                        return true;
        
        }else if((tombol[1][0].getText() == "O")
                                &&(tombol[1][1].getText() == "O")
                                &&(tombol[1][2].getText() == "O")) {
                        tombol[1][0].setBackground(Color.white);
                        tombol[1][1].setBackground(Color.white);
                        tombol[1][2].setBackground(Color.white);
                        return true;
        
        }else if((tombol[2][0].getText() == "O")
                                &&(tombol[2][1].getText() == "O")
                                &&(tombol[2][2].getText() == "O")) {
                        tombol[2][0].setBackground(Color.white);
                        tombol[2][1].setBackground(Color.white);
                        tombol[2][2].setBackground(Color.white);
                        return true;
                        
        }else if((tombol[0][1].getText() == "O")
                                &&(tombol[1][1].getText() == "O")
                                &&(tombol[2][1].getText() == "O")) {
                        tombol[0][1].setBackground(Color.white);
                        tombol[1][1].setBackground(Color.white);
                        tombol[2][1].setBackground(Color.white);
                        return true;
                                
        }else if((tombol[0][2].getText() == "O")
                                &&(tombol[1][2].getText() == "O")
                                &&(tombol[2][2].getText() == "O")) {
                        tombol[0][2].setBackground(Color.white);
                        tombol[1][2].setBackground(Color.white);
                        tombol[2][2].setBackground(Color.white);
                        return true;
                                
        }else if((tombol[0][2].getText() == "O")
                                &&(tombol[1][1].getText() == "O")
                                &&(tombol[2][0].getText() == "O")) {
                        tombol[0][2].setBackground(Color.white);
                        tombol[1][1].setBackground(Color.white);
                        tombol[2][3].setBackground(Color.white);
                        return true;
        }
        return false;
    }

public void disable() {
        for(int i = 0; i < kotak; i++) {
                for(int j = 0; j < kotak; j++) {
                        tombol[i][j].setEnabled(false);
                }
        }
}
}