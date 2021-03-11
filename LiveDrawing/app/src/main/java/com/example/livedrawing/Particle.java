package com.example.livedrawing;

import android.graphics.PointF;

public class Particle {

    PointF mVelocity;
    PointF mPosition;

    Particle(PointF direction) {
        mVelocity = new PointF();
        mPosition = new PointF();

        // Determine the direction
        mVelocity.x = direction.x;
        mVelocity.y = direction.y;
    }// End Particle constructor method

    void update(float fps) {
        // Move the particle
        mPosition.x += mVelocity.x;
        mPosition.y += mVelocity.y;
    } // End update method

    void setPosition(PointF position) {
        mPosition.x = position.x;
        mPosition.y = position.y;
    } // End setPosition method

    PointF getPosition() {
        return mPosition;
    }// End PointF method

} // End Particle class
