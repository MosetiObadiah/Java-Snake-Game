package org.snake;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JPanel {
    JLabel label;
    Random random = new Random();
    int width;
    int height;
    String direction = "right";

    public Game() { init(); }

    public void init() {
        setLayout(new MigLayout());

        label = new JLabel("SNAKE");
        setFocusable(true);
        requestFocusInWindow();

        int startingLocationX = random.nextInt(200, 600);
        int startingLocationY = random.nextInt(200, 600);
        label.setLocation(startingLocationX, startingLocationY);

        Dimension size = label.getPreferredSize();
        width = size.width;
        height = size.height;

        //TODO add a way to change the snake's speed
        Timer timer = new Timer(500, e -> {
            snakeDirection();
            checkSnakeWallCollision();
        });

        timer.start();

        add(label);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) { }
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        direction = "up";
                        break;
                    case KeyEvent.VK_DOWN:
                        direction = "down";
                        break;
                    case KeyEvent.VK_LEFT:
                        direction = "left";
                        break;
                    case KeyEvent.VK_RIGHT:
                        direction = "right";
                        break;
                }
            }
            @Override
            public void keyReleased(KeyEvent keyEvent) { }
        });
    }

    private void snakeDirection() {
        int x = label.getX();
        int y = label.getY();

        switch (direction) {
            case "up" -> label.setLocation(x, y - 20);
            case "down" -> label.setLocation(x, y + 20);
            case "left" -> label.setLocation(x - 20, y);
            case "right" -> label.setLocation(x + 20, y);
        }
    }

    private void checkSnakeWallCollision() {
        int newSnakeX = random.nextInt(200,600);
        int newSnakeY = random.nextInt(200, 600);

        if (label.getX() > 700 - width || label.getX() < 2 || label.getY() > 700 - height || label.getY() < 2) {
            JOptionPane.showMessageDialog(null, "failed");
            label.setLocation(newSnakeX, newSnakeY);
        }
    }
}
