/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellolabel;


import java.awt.Container;
import javax.swing.*; 
 
public class HelloLabel { 
  public static void main(String[] args) throws Exception { 
    JFrame frame = new JFrame("TypingGame"); 
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    frame.add(label1); 
    frame.add(label2);
    frame.add(label3);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(400, 200); 
    frame.setVisible(true); 
    
    Container c = frame.getContentPane();
    BoxLayout layout = new BoxLayout(c,BoxLayout.Y_AXIS);
    frame.setLayout(layout);
    
    label1.setText("Word to be typed");
    label2.setText("Timer"); 
    label3.setText("User will type the word here");
    
    
  } 
}

