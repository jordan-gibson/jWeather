package com.jacquie.jordan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * The Activity class serves as the entry point for an applications interaction with the user, it provides the window in which the app draws its UI. Each screen that we want to present to the user
 * will be a different instance of Activity. For example, in an Email application we could have an Activity which is responsible for showing the users inbox, then when the user wants to compose
 * a new Email, he/she could click a button, and a new Activity would come onscreen presenting the user with a new UI which they could use to compose an Email. This Activity, which I called MainActivity,
 * is the entry point for this application. When the user launches the app, they will be presented with the UI that we configure for this Activity, and anything they do to interact with the app
 * while this Activity is onscreen will be handled in the code below.
 */
public class MainActivity extends Activity {
    private RecyclerView recyclerView;

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

        recyclerView = (RecyclerView)findViewById(R.id.main_activity_recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

        DailyWeatherAdapter adapter = new DailyWeatherAdapter(Weather.testWeather());
        recyclerView.setAdapter(adapter);
    }

    /**
     * The Activity moves from onCreate() to onStart() and the Activity becomes visible to the user. Perform any final preparations needed for the Activity to come into the foreground and
     * become interactive. After onStart() the OS will call onResume().
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * The Activity is now at the top of the Activity stack and is capturing all user input. Most of the applications core functionality is handled in this method.
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * The OS calls this method when the user performs an action which pushes this Activity out of focus, for example the user might have pushed the back button to move out of the app. An Activity
     * in the paused state may continue to update the UI. The onPause() method always follows the onResume() method. After
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * The OS calls onStop() when the Activity is no longer visible to the user, and after completing onPause(). This could be the result of a new Activity starting overtop of this Activity, or the
     * user may have closed the application. The Activity hasn't been destroyed, it is just in an inactive state.
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * The onRestart() method is called when an activity in the stopped state is about to restart. The state of the Activity is restored to the point at which it was stopped. This method will
     * be followed by onStart().
     */
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    /**
     * This is the final method called by the OS when the Activity is being completely destroyed. Generally used to cleanup and relinquish all resources being used by the application.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
