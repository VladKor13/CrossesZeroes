package com.company.activities;

import java.awt.*;

public abstract class Activity {
    private String activityID;

    public Activity(String activityID){
        this.activityID = activityID;
    }

    public abstract void init(Container container);

    public String getActivityID(){
        return activityID;
    }
}
