package com.davidsku.eathis;

import com.davidsku.eathis.EaThisObject;
import com.davidsku.eathis.ID;

import java.awt.*;

public class Block extends EaThisObject {
    public Block(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }
}
