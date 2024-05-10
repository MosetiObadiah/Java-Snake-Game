package org.snake.code;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gameArena extends JPanel implements ActionListener {
    public gameArena() {
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new MigLayout());
        topPanel.setBackground(Color.CYAN);
        topPanel.setPreferredSize(new Dimension(700, 40));
        add(topPanel, BorderLayout.NORTH);


        JPanel gameBoard = new JPanel();
        gameBoard.setBackground(Color.BLACK);
        gameBoard.setFocusable(true);
        add(gameBoard);

        Timer timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLoop();
                System.out.println("Timer");
            }
        });
        timer.start();
    }

    private void gameLoop() {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
