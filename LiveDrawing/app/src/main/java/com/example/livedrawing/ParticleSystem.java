package com.example.livedrawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

import java.util.ArrayList;
import java.util.Random;

public class ParticleSystem {
    private float mDuration;

    private ArrayList<Particle> mParticles = new ArrayList<Particle>();
    private Random random = new Random();
    boolean mIsRunning = false;

    void init(int numParticles) {
        // Create the particles

        for (int i = 0; i < numParticles; i++) {
            float angle = (random.nextInt(360));
            angle = angle * 3.14f / 180.f;

            // Option 1 - Slow particles
            // float speed = (random.nextFloat()/10);

            // Option 2 - Fast particles
            float speed = random.nextInt(10)+1;

            PointF direction;

            direction = new PointF((float)Math.cos(angle) * speed, (float)Math.sin(angle) * speed);

            mParticles.add(new Particle(direction));
        } // End for
    } // End init method

    void update(long fps){
        mDuration -= (1f/fps);

        for(Particle p : mParticles){
            p.update(fps);
        } // End for

        if (mDuration < 0)
        {
            mIsRunning = false;
        } // End if
    } // end update method

    void emitParticles(PointF startPosition){
        mIsRunning = true;

        // Option 1 - System lasts for half a minute
        mDuration = 30f;

        // Option 2 - System lasts for 2 seconds
        //mDuration = 3f;

        for(Particle p : mParticles){
            p.setPosition(startPosition);
        } // End if
    } // End emitParticles method

    void draw(Canvas canvas, Paint paint) {

        for (Particle p : mParticles) {

            /* Option 1 - Coloured particles
            paint.setARGB(255, random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)); */

            // Option 2 - White particles
            paint.setColor(Color.argb(255,255,255,255));

            // How big is each particle?
            float sizeX = 0;
            float sizeY = 0;

            // Option 1 - Big particles
            //sizeX = 25;
            //sizeY = 25;

            // Option 2 - Medium particles
            // sizeX = 10;
            // sizeY = 10;

            // Option 3 - Tiny particles
            sizeX = 6;
            sizeY = 6;

            // Draw the particle
            // Option 1 - Square particles
            canvas.drawRect(p.getPosition().x,
                    p.getPosition().y,
                    p.getPosition().x + sizeX,
                    p.getPosition().y + sizeY,
                    paint);

            // Option 2 - Circle particles
            //canvas.drawCircle(p.getPosition().x, p.getPosition().y, sizeX, paint);
        } // End for
    } // End draw method

} // End ParticleSystem class
