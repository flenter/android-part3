package com.example.androidpart3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.androidpart3.MainActivity;
import com.example.androidpart3.R;

/**
 * Created by jacco @ wercker on 9/23/13.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.wercker.gettingstarted", MainActivity.class);
    }


    public void testWelcomeText() {
        MainActivity activity;
        activity = (MainActivity) getActivity();

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.introText);
        assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        assertNotNull(introText);

        assertTrue("Check intro text", introText.equals("Hello universe!"));
    }
}