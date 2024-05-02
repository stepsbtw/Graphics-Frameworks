package Graphics;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class MyPanel extends JPanel {
    MyPanel(){
        this.setPreferredSize(new Dimension(600,600));
    }

    @Override
    public void paint(Graphics g){

        //Graphics2D g2d = (Graphics2D)g;
        /*
        g2d.setPaint(Color.pink);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0,0,600,600);

        g2d.setPaint(Color.blue);
        //g2d.drawRect(0,0,200,100);
        g2d.fillRect(0,0,200,100);

        g2d.setPaint(Color.yellow);
        g2d.drawOval(0,0,300,300);
        g2d.setPaint(Color.orange);
        g2d.fillOval(20,20,100,100);
        */
        int[] x = {100,150,200};
        int[] y = {200,100,150};
        //g2d.drawPolygon(x,y,3);
        g.drawPolygon(x,y,3);
    }
}
