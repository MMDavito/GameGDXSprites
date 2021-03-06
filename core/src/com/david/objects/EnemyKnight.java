/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 *
 * @author daca97002
 */
public class EnemyKnight {

    //speedincrese over time?
    private FileHandle knightFile = Gdx.files.internal("knight.png");
    private Sprite knight = new Sprite(new Texture(knightFile));

    private int xSpeed = 2;
    private int ySpeed = 2;
    private int shotSpeed = 5;
    private int shotInterval = 60;
    private int health = 1;
    private int deathCounter = 1;
    private boolean alive = false;

    public int getDeathCounter() {
        return deathCounter;
    }

    public void setDeathCounter(int deathCounter) {
        if (deathCounter > 0 && deathCounter < 5) {
            this.deathCounter = this.deathCounter + deathCounter;
        }
    }

    public int getySpeed() {
        return ySpeed;
    }

    /**
     *
     * @param ySpeed Any int value works, it just inverts the current y-speed
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = -this.ySpeed;
    }

    /**
     *
     * @param speed Any int value works, it just inverts the current x-speed
     */
    public void setxSpeed(int speed) {
        this.xSpeed = -this.xSpeed;
    }

    public Sprite getKnight() {
        return knight;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getShotSpeed() {
        return shotSpeed;
    }

    public int getShotInterval() {
        return shotInterval;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 && health >= -5) {
            this.health = this.health + health;

            if (this.health < 0) {
                this.setAlive(false);
            }
        } else if (health > 0) {
            this.health = health;
            this.setAlive(true);
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
