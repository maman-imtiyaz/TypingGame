/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame.window;

import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class MainWindow extends JFrame{

    public MainWindow(String windowTitle){
        this.setTitle(windowTitle);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        this.add(label1); 
        this.add(label2);
        this.add(label3);
    
        Container c = this.getContentPane();
        BoxLayout layout = new BoxLayout(c,BoxLayout.Y_AXIS);
        this.setLayout(layout);
    
        label1.setText("Word to be typed");
        label2.setText("Timer"); 
        label3.setText("User will type the word here");
        
    }
    
}
