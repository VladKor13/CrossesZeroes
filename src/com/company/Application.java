package com.company;

import com.company.activities.Activity;
import com.company.activities.GameActivity;
import com.company.activities.MainMenuActivity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Application {

    private static ArrayList<Activity> activities;
    private static Activity currentActivity;
    private static JFrame frame;

    public Application(){
        activities = new ArrayList<>();

        //FRAME INIT
        frame = new JFrame("CrossesZeroes by KOR");
        frame.setLocation(400, 130);
        frame.setPreferredSize(new Dimension( 600, 600));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //ACTIVITIES INIT
        addActivity(new MainMenuActivity("MainMenu"));
        addActivity(new GameActivity("Game"));
        changeActivity(getActivity("MainMenu"));
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public static Activity getActivity(String activityID){
        for(Activity activity : activities){
            if(activity.getActivityID().equals(activityID)){
                return activity;
            }
        }
        return null;
    }

    public static void changeActivity(Activity currentActivity){
        Application.currentActivity = currentActivity;
        initActivity();
    }

    public static void initActivity(){
        frame.getContentPane().removeAll();

        if(currentActivity != null) currentActivity.init(frame.getContentPane());

        frame.revalidate();
        frame.repaint();
    }
    public void exitApp(){
        this.frame.dispose();
    }
}
