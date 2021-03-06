package com.zetcode;

import java.awt.EventQueue;
import javax.swing.*;

public class Snake extends JFrame {

    public Snake() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake3310");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/resources/icon.png");
        setIconImage(icon.getImage());
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
