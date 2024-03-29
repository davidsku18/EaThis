package com.davidsku.eathis;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Handler {

    public ArrayList<EaThisObject> object = new ArrayList<EaThisObject>();

    private boolean up = false, down = false, right = false, left = false;

    public void tick() {
        for(int i = 0; i < object.size(); i++) {
            EaThisObject tempObject = object.get(i);

            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for(int i = 0; i < object.size(); i++) {
            EaThisObject tempObject = object.get(i);

            tempObject.render(g);
        }
    }

    public void addObject(EaThisObject tempObject) {
        object.add(tempObject);
    }

    public void removeObject(EaThisObject tempObject) {
        object.remove(tempObject);
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }
}
