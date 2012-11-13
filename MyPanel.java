/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author ajka
 */
public class MyPanel extends JPanel {

    public Usecka u;
    private int x = 75;
    private int r = 7;
    Bod b1;
    Bod b2;
  
    
    MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
   

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        Color c = Color.LIGHT_GRAY;
        g.setColor(c);
        int height = getHeight();
        int width = getWidth();
          
        g.fillOval(width / 2 - r / 2, height / 2 - r / 2, r, r);
        g.drawLine(0, height / 2, width, height / 2);
        g.drawLine(width / 2, 0, width / 2, height);
        Bod stred = new Bod(width / 2 - r / 2, height / 2 - r / 2, r);
        b1 = new Bod(0, 0, 0);
        b2 = new Bod(0, 0, 0);
        u = new Usecka(b1, b2);
      
 
 
    u.b1.setX(stred.getX());
    u.b1.setY(stred.getY() - x);
    u.b1.setR(r);
    u.b2.setX(stred.getX());
    u.b2.setY(stred.getY() + x);
    u.b2.setR(r);
    u.paintUseka(g);
    
            
  

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            
                if(u.b1.inBod(e.getX(), e.getY())){
          
                    u.b1.setX(e.getX());
                    u.b1.setY(e.getY());
                    u.paintUseka(g);
        //            repaint();
                    
                }
                if(u.b2.inBod(e.getX(), e.getY())){
                
                    u.b2.setX(e.getX());
                    u.b2.setY(e.getY());
                    u.paintUseka(g);
          //          repaint();
                   
                }

            }
            
           /*@Override
            public void mouseReleased(MouseEvent e) {
            }*/
            });
       
        





    }
}


