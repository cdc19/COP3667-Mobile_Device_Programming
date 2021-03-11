package com.example.livedrawing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class LiveDrawingActivity extends Activity {

    private LiveDrawingView mLiveDrawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mLiveDrawingView = new LiveDrawingView(
                this, size.x, size.y);
        setContentView(mLiveDrawingView);
    }  // End onCreate method

    @Override
    protected void onResume() {
        super.onResume();
        mLiveDrawingView.resume();
    }  // End onResume method

    @Override
    protected void onPause() {
        super.onPause();
        mLiveDrawingView.pause();
    } // End onPause method

}  // End LiveDrawingActivity class