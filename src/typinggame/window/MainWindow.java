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
        JTextField textfield1 = new JTextField();
        JTextField textfield2 = new JTextField(); 
        
        this.add(textfield1); 
        this.add(label1);
        this.add(textfield2);
    
        Container c = this.getContentPane();
        BoxLayout layout = new BoxLayout(c,BoxLayout.Y_AXIS);
        this.setLayout(layout);
    
        textfield1.setText("Word to be typed");
        label1.setText("Timer"); 
        textfield2.setText("User will type the word here");
        
    }
    
}
