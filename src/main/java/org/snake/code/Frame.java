package org.snake.code;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    void switchPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
        pack();
    }
}
