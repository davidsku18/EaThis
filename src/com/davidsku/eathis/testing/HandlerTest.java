package com.davidsku.eathis.testing;


import com.davidsku.eathis.*;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandlerTest {

    @Test
    public void tick() {

    }

    @Test
    public void render() {

    }

    @Test
    public void addObject() {
        Handler handler = new Handler();
        handler.addObject(new Block(0,0, ID.Block));
        for(int i = 0; i < handler.object.size(); i++) {
            EaThisObject tempObject = handler.object.get(i);
            Assert.assertEquals(tempObject.getId(), ID.Block);
        }
    }

    @Test
    public void removeObject() {
        Handler handler = new Handler();
        Block block = new Block(0,0, ID.Block);
        handler.addObject(block);
        handler.removeObject(block);
        Assert.assertEquals(handler.object.size(), 0);

    }

    @Test
    public void isUp() {
        Handler handler = new Handler();
        handler.setUp(true);
        Assert.assertTrue(handler.isUp());
        handler.setUp(false);
        Assert.assertFalse(handler.isUp());

    }

    @Test
    public void setUp() {
        Handler handler = new Handler();
        handler.setUp(true);
        Assert.assertTrue(handler.isUp());
        handler.setUp(false);
        Assert.assertFalse(handler.isUp());
    }

    @Test
    public void isDown() {
        Handler handler = new Handler();
        handler.setDown(true);
        Assert.assertTrue(handler.isDown());
        handler.setDown(false);
        Assert.assertFalse(handler.isDown());
    }

    @Test
    public void setDown() {
        Handler handler = new Handler();
        handler.setDown(true);
        Assert.assertTrue(handler.isDown());
        handler.setDown(false);
        Assert.assertFalse(handler.isDown());
    }

    @Test
    public void isRight() {
        Handler handler = new Handler();
        handler.setRight(true);
        Assert.assertTrue(handler.isRight());
        handler.setRight(false);
        Assert.assertFalse(handler.isRight());
    }

    @Test
    public void setRight() {
        Handler handler = new Handler();
        handler.setRight(true);
        Assert.assertTrue(handler.isRight());
        handler.setRight(false);
        Assert.assertFalse(handler.isRight());
    }

    @Test
    public void isLeft() {
        Handler handler = new Handler();
        handler.setLeft(true);
        Assert.assertTrue(handler.isLeft());
        handler.setLeft(false);
        Assert.assertFalse(handler.isLeft());
    }

    @Test
    public void setLeft() {
        Handler handler = new Handler();
        handler.setLeft(true);
        Assert.assertTrue(handler.isLeft());
        handler.setLeft(false);
        Assert.assertFalse(handler.isLeft());
    }
}