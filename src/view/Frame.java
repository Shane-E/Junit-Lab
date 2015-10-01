package view;

import javax.swing.JFrame;
import controller.App;

public class Frame extends JFrame{
    private final MainPanel panel;
    
    public Frame(MainPanel panel){
        this.panel = panel;
        final JFrame frame = new JFrame("Junit Lab Login");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final MainPanel mainPanel = this.panel;
        frame.add(mainPanel);
        
        frame.setVisible(true);
    }
    
    public MainPanel getPanel(){
        return panel;
    }
}
