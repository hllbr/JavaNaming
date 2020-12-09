
package com.hllbr.swingornegi;

import javax.swing.*;

public class Pencere {
    private JFrame frame;
    public Pencere(){//Constructor
        frame = new JFrame();
        JButton button = new JButton("Tıkla");
        button.setBounds(130,100,100,40);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
  
    }
    
}
