package com.udacity.gradle.builditbigger;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        MainActivityFragment.testFlag = true;
        new EndpointAsyncTask().execute((Runnable) fragment);
        Thread.sleep(5000);
        assertNotNull("Joke = " + MainActivityFragment.loadedJoke, MainActivityFragment.loadedJoke);
    }
}