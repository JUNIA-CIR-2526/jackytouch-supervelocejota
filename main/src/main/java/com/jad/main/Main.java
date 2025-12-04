package com.jad.main;

import com.jad.controller.Controller;
import com.jad.textwindow.TextWindow;

public class Main {
    public static void main(String[] args) {
        TextWindow textWindow = new TextWindow();
        textWindow.setVisible(true);
        textWindow.display("keo's SuperVeloceJota");
        Controller controller = new Controller();
    }
}
