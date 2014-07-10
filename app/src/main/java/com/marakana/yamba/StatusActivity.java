package com.marakana.yamba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class StatusActivity extends Activity {
    private static final String TAG = "StatusActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate"); //
//        setContentView(R.layout.new_activity_status);
        // Check if this activity was created before
        if (savedInstanceState == null) { //
            // Create a fragment
            StatusFragment fragment = new StatusFragment(); //
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment,
                            fragment.getClass().getSimpleName())
                    .commit(); //
        }
    }
}
