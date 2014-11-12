/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame.window;

import javax.swing.JFrame;

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
    }
    
}
