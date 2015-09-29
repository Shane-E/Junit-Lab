package controller;

import view.Frame;

public class App {
    private final Frame f;
    public App(){
        f = new Frame(this);
    }

    public static void main(String[] args) {
        final App mainApp = new App();
    }
    
}
