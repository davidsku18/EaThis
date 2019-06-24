package com.davidsku.eathis;

import java.awt.*;

public abstract class EaThisObject {
    protected  int x, y;
    protected float velX = 0, velY = 0;
    protected ID id;

    public EaThisObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract Rectangle getBounds();

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getVelx() {
        return velX;
    }

    public void setVelx(float velX) {
        this.velX = velX;
    }

    public float getVely() {
        return velY;
    }

    public void setVely(float velY) {
        this.velY = velY;
    }
}
