package com.jad.view;

import com.jad.textwindow.TextWindow;
import java.util.ArrayList;
import java.util.List;

public class View {
    private final TextWindow textWindow;
    private List<String> currentCarArt = new ArrayList<>();
    private List<String> currentLogs = new ArrayList<>();

    public View() {
        this.textWindow = new TextWindow();
        this.textWindow.setVisible(true);
    }

    public void displayCar(List<String> asciiArt) {
        this.currentCarArt = asciiArt;
        this.refreshDisplay();
    }

    public void displayLog(List<String> effects) {
        this.currentLogs = effects;
        this.refreshDisplay();
    }

    private void refreshDisplay() {
        StringBuilder sb = new StringBuilder();
        for (String line : this.currentCarArt) {
            sb.append(line).append("\n");
        }
        sb.append("\n--- Active Effects ---\n");
        for (String log : this.currentLogs) {
            sb.append(log).append("\n");
        }
        this.textWindow.display(sb.toString());
    }
}
