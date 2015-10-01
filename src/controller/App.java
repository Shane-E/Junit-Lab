package controller;

import view.Frame;
import view.MainPanel;

public class App {
    private final Frame f;
    
    
    public App(){
        f = new Frame(new MainPanel());
    }

    public static void main(String[] args) {
        final App mainApp = new App();
    }
    
    public MainPanel getPanel(){
        return f.getPanel();
    }
}
