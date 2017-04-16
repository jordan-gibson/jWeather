package com.jacquie.jordan.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * The Activity class serves as the entry point for an applications interaction with the user, it provides the window in which the app draws its UI. Each screen that we want to present to the user
 * will be a different instance of Activity. For example, in an Email application we could have an Activity which is responsible for showing the users inbox, then when the user wants to compose
 * a new Email, he/she could click a button, and a new Activity would come onscreen presenting the user with a new UI which they could use to compose an Email. This Activity, which I called MainActivity,
 * is the entry point for this application. When the user launches the app, they will be presented with the UI that we configure for this Activity, and anything they do to interact with the app
 * while this Activity is onscreen will be handled in the code below.
 */
public class MainActivity extends Activity {

    /**
     * Activities go through a number of states throughout their lifetime. A series of callbacks are used to handle the transitions between the states, some of them are optional, some are not.
     * The onCreate() callback is required, and is called by the Android OS when this Activity is created. Think "the user just launched this application and the OS is going through the process of
     * creating our UI in order to present it to the user." Most commonly we are going to be using the setContentView() method to tell the OS what we want to put on the screen, and that is defined
     * by a layout file. Navigate to res > layout > activty_main.xml to see the layout which is going to be put on the screen.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
