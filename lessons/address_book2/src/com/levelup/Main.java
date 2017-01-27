package com.levelup;

import com.levelup.view.impl.CitizenTablePanel;
import com.levelup.view.impl.CreateCitizenDialog;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CitizenTablePanel panel = new CitizenTablePanel();
        panel.setVisible(true);
    }
}
