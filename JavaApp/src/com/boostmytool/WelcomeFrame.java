package com.boostmytool;

import javax.swing.*;

public class WelcomeFrame extends JFrame {
    private JPanel frame;
    private JLabel welcomeText;

    public WelcomeFrame() {
        add(frame);
        add(welcomeText);


        setTitle("Welcome!");
        setSize(750, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        WelcomeFrame myFrame = new WelcomeFrame();
    }

}
