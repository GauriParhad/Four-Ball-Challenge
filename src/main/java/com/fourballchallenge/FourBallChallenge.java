package com.fourballchallenge;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int HEIGHT = 320;
    public static final int WIDTH = 520;
    public static final int CIRCLE_DIAMETER = 25;
    
    private float ballAtX1 = 0;
    private float ballAtX2 = 0;
    private float ballAtX3 = 0;
    private float ballAtX4 = 0;
    
    public static final float ballAtY1 = HEIGHT * 1 / 5;
    public static final float ballAtY2 = HEIGHT * 2 / 5;
    public static final float ballAtY3 = HEIGHT * 3 / 5;
    public static final float ballAtY4 = HEIGHT * 4 / 5;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        background(128);
        getCirce(ballAtX1, ballAtY1);
        getCirce(ballAtX2, ballAtY2);
        getCirce(ballAtX3, ballAtY3);
        getCirce(ballAtX4, ballAtY4);
        ballAtX1 += 1;
        ballAtX2 += 2;
        ballAtX3 += 3;
        ballAtX4 += 4;
    }

    private void getCirce(float ballAtX, float ballAtY) {
        ellipse(ballAtX, ballAtY, CIRCLE_DIAMETER);
    }

    private void ellipse(float ballAtX, float ballAtY, int circleDiameter) {
    }

}
