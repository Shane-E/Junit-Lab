package view;

import javax.swing.JFrame;
import controller.App;

public class Frame extends JFrame{
    
    public Frame(App main){
        final JFrame frame = new JFrame("Junit Lab Login");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final MainPanel mainPanel = new MainPanel();
        frame.add(mainPanel);
        
        frame.setVisible(true);
    }
}
