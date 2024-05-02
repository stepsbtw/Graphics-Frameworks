package Swing;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFRAME = GUI Window
public class MyFrame extends JFrame implements ActionListener {
    
    ImageIcon frameIcon;
    JButton button;
    ImageIcon buttonIcon;

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    MyFrame() {
        this.initFrame();
        this.createButton();
        this.setVisible(true);
    }
    
    private void initFrame(){
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setTitle("ATUMALACA");
        this.setLayout(null); // presets
        frameIcon = new ImageIcon("Swing/ABACAXILOGO.jpg");
        this.setIconImage(frameIcon.getImage());
        this.setLocationRelativeTo(null); // center the frame
        // this.getContentPane().setBackground(new Color(200, 120, 150));
        this.getContentPane().setBackground(Color.PINK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void createButton(){
        button = new JButton();
        button.setBounds(WIDTH/2-50,HEIGHT/2-50,200,200);
        button.addActionListener(this); // my frame is implementing.
        // button.addActionListenter(e->System.out.println("AAAAA!");
        button.setText("nao clique!");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFocusable(false); // removes outline
        buttonIcon = new ImageIcon("Swing/jgk.jpg");
        button.setIcon(buttonIcon);
        button.setFont(new Font("Comic-Sans", Font.BOLD,25));
        button.setIconTextGap(20);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.LIGHT_GRAY);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("AAAAA!");
            /*
            if(button.isEnabled()){
                button.setEnabled(false);
            }else{
                button.setEnabled(true);
            }
            */
        }
    }
}