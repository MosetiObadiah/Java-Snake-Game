package org.snake;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

        switchPanel(new Game());
        setVisible(true);
    }

    void switchPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
    }
}
