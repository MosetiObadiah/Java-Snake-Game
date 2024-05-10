package org.snake.code;

import javax.swing.*;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        Frame gameFrame = new Frame();

        SwingUtilities.invokeLater(() -> {
            gameFrame.switchPanel(new showSplashScreen(gameFrame));
        });
        
    }
}