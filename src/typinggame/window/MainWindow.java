/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame.window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class MainWindow extends JFrame {

    int i = 0;
    Timer timer;
    JLabel label;
    public MainWindow(String windowTitle) {
        this.setTitle(windowTitle);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        BoxLayout layout = new BoxLayout(c, BoxLayout.Y_AXIS);
        this.setLayout(layout);

        JTextField textField1 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.CENTER);
        this.add(textField1);
        textField1.setText("Word to be typed");

        label = new JLabel();
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(label);
        label.setText("Timer");

        JTextField textField2 = new JTextField();
        textField2.setHorizontalAlignment(JTextField.CENTER);
        this.add(textField2);
        textField2.setText("User will type the word here");

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (i >= 10) {
                    label.setText(" Time is out ");
                    timer.restart();
                    i = 0;
                } else {
                    i++;
                    label.setText(i + " seconds");
                }
            }
        });
        timer.start();
    }

}
