package com.udacity.gradle.builditbigger;


import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
/**
 * Created by kev on 3/21/16.
 */

@RunWith(AndroidJUnit4.class)
class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute();
        Thread.sleep(5000);
        assertTrue("Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
    }
}