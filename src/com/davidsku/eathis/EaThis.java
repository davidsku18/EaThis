package com.davidsku.eathis;

import javax.net.ssl.HandshakeCompletedEvent;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class EaThis extends Canvas implements Runnable {

    private boolean isRunning = false;
    private Thread thread;
    private Handler handler;

    public EaThis() {
        new Window(1000, 563, "EaThis", this);
        start();

        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));

        handler.addObject(new WhiteBloodCell(100, 100, ID.Player, handler));

    }

    private void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    private void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frames = 0;
            }
        }
        stop();
    }

    public void tick() {
        handler.tick();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        ///////////////////////////////////////////

        g.setColor(Color.RED);
        g.fillRect(0, 0, 1000, 563);

        handler.render(g);
        ///////////////////////////////////////////
        g.dispose();
        bs.show();
    }

    public static void main(String args[]) {
        new EaThis();
    }
}
