/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafy;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ajka
 */
public class Grafy {

    public static void main(String[] args) {
        // TODO code application logic here
         SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                plocha(); 
            }
        });      
    }
    
    private static void plocha() {
        JFrame frame = new JFrame("Komplexne funkcie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();   
        final MyPanel vzor = new MyPanel();
        final MyPanel obraz = new MyPanel();
        frame.setLayout(new GridLayout(1,3));
              
        frame.add(vzor);
        frame.add(obraz);             
        frame.add(panel); 
       // panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        JButton vykresli=new JButton("Vykresli");
        panel.add(vykresli);     
        final JTextField vstup=new JTextField(15);
        panel.add(vstup);
            
         vykresli.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {                    
                   
                    Scanner s = new Scanner(vstup.getText());
                    int l = s.nextInt();
                    Bod o1 = vzor.u.b1;
                    Bod o2 = vzor.u.b2;

                    int x1 = o1.getX();
                    o1.setX(x1 + l);
                    obraz.u.b1 = o1;
                    int x2 = o2.getX();
                    o1.setX(x2 + l);
                    obraz.u.b2 = o2;

                    obraz.repaint();
                   
                };
            });
         
        frame.pack();
        frame.setVisible(true);
    }
    
}
