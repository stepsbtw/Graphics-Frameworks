package Swing;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;

// JFRAME = GUI Window
public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(600, 600);
        this.setResizable(false);

        this.setTitle("ATUMALACA");

        ImageIcon icon = new ImageIcon("ABACAXILOGO.jpg");
        this.setIconImage(icon.getImage());

        this.setLocationRelativeTo(null); // center the frame

        //this.getContentPane().setBackground(Color.PINK);
        this.getContentPane().setBackground(new Color(200, 120, 150));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.setVisible(true);
    }
}