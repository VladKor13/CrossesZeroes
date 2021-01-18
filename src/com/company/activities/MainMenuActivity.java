package com.company.activities;


import com.company.Application;
import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuActivity extends Activity {

    private Font btnFont = new Font ("TimesRoman", Font.BOLD , 50);

    public MainMenuActivity(String activityID) {
        super(activityID);
    }

    @Override
    public void init(Container container) {
        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);

        Color backgroundcolor = new Color(0xFFFDD0);
        container.setBackground(backgroundcolor);

        JButton startButton = new JButton("Start");
        startButton.setFont(btnFont);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Application.changeActivity(Application.getActivity("Game"));
            }
        });

        JButton statsButton = new JButton("Stats");
        statsButton.setFont(btnFont);
        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

//                Main.crossesZeroesGame.changeActivity(Main.crossesZeroesGame.getActivity("Stats"));
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(btnFont);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                Main.crossesZeroesGame.exitApp();
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
