package com.company.activities;


import com.company.Application;
import com.company.Main;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuActivity extends Activity {

    private Font btnFont = new Font ("TimesRoman", Font.BOLD  , 50);
    private Color btnColor = new Color(0x3FAB9B);
    private Color backgroundcolor = new Color(0xFFD3E0);

    public MainMenuActivity(String activityID) {
        super(activityID);
    }

    @Override
    public void init(Container container) {

        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);



        container.setBackground(backgroundcolor);

        JButton startButton = new JButton("Start");
        startButton.setBackground(btnColor);
        startButton.setFont(btnFont);
        startButton.setFocusPainted(false);
        startButton.setBorderPainted(false);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Application.changeActivity(Application.getActivity("Game"));
            }
        });


        JButton statsButton = new JButton("Stats");
        statsButton.setBackground(btnColor);
        statsButton.setFont(btnFont);
        statsButton.setFocusPainted(false);
        statsButton.setBorderPainted(false);
        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Application.changeActivity(Application.getActivity("Stats"));
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(btnColor);
        exitButton.setFont(btnFont);
        exitButton.setFocusPainted(false);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Application.exitApp();
            }
        });

        container.add(startButton);
        container.add(statsButton);
        container.add(exitButton);
        //Placing start button
        layout.putConstraint(SpringLayout.WEST, startButton,
                10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, startButton,
                100, SpringLayout.NORTH, container);
        //Placing stats button
        layout.putConstraint(SpringLayout.WEST, statsButton,
                10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, statsButton,
                210, SpringLayout.NORTH, container);
        //Placing exit button
        layout.putConstraint(SpringLayout.WEST, exitButton,
                10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, exitButton,
                320, SpringLayout.NORTH, container);
    }
}
