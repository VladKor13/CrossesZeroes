package com.company.activities;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActivity extends Activity {

    public GameActivity(String activityID) {
        super(activityID);
    }

    @Override
    public void init(Container container) {
        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);
        Color backgroundcolor = new Color(0x7B1823);
        container.setBackground(backgroundcolor);

        JButton backButton = new JButton("Start");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                Main.crossesZeroesGame.changeActivity(Main.crossesZeroesGame.getActivity("MainMenu"));
            }
        });


        container.add(backButton);
        //Placing start button
        layout.putConstraint(SpringLayout.WEST, backButton,
                10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, backButton,
                100, SpringLayout.NORTH, container);
    }
}
