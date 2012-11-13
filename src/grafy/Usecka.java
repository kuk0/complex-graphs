/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafy;


import java.awt.Graphics;

/**
 *
 * @author ajka
 */
public class Usecka {
    Bod b1;
    Bod b2;
    
    Usecka(Bod b1,Bod b2){
        this.b1=b1;
        this.b2=b2;
    }
   public void paintUsecka(Graphics g){
       b1.paintBod(g);
       b2.paintBod(g);        
       g.drawLine(b1.getX()+b1.getR()/2, b1.getY()+b1.getR()/2, b2.getX()+b2.getR()/2, b2.getY()+b2.getR()/2);
    }
    
}
