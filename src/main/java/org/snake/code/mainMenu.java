/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.snake.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 *
 * @author user85
 */
public class mainMenu extends javax.swing.JPanel implements ActionListener{
    Frame gameframe;
    /**
     * Creates new form mainMenu
     */
    public mainMenu(Frame gameFrame) {
        this.gameframe = gameFrame;
        initComponents();
        setPreferredSize(new java.awt.Dimension(700, 700));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuPlayBtn = new javax.swing.JButton();
        menuPlayBtn.addActionListener(this);
        menuSettingsBtn = new javax.swing.JButton();
        menuSettingsBtn.addActionListener(this);
        menuQuitBtn = new javax.swing.JButton();
        menuQuitBtn.addActionListener(this);

        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(176, 226, 176));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 3, 21));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERPENTS SCRIPT");

        jLabel2.setFont(new java.awt.Font("Cantarell", 2, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 3, 21));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MAIN MENU PACK");

        menuPlayBtn.setBackground(new java.awt.Color(222, 220, 255));
        menuPlayBtn.setForeground(new java.awt.Color(5, 3, 21));
        menuPlayBtn.setText("Play");

        menuSettingsBtn.setBackground(new java.awt.Color(222, 220, 255));
        menuSettingsBtn.setForeground(new java.awt.Color(5, 3, 21));
        menuSettingsBtn.setText("Settings");

        menuQuitBtn.setBackground(new java.awt.Color(222, 220, 255));
        menuQuitBtn.setForeground(new java.awt.Color(5, 3, 21));
        menuQuitBtn.setText("Quit");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menuPlayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menuSettingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(menuQuitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(menuPlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(menuSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(menuQuitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menuPlayBtn;
    private javax.swing.JButton menuQuitBtn;
    private javax.swing.JButton menuSettingsBtn;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == menuPlayBtn){
            gameframe.switchPanel(new gameArena());
        }
        if(actionEvent.getSource() == menuSettingsBtn){
            System.out.println("Settings Button Clicked");
        }
        if(actionEvent.getSource() == menuQuitBtn){
            System.exit(0);
        }
    }
    // End of variables declaration//GEN-END:variables
}
