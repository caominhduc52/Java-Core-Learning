package com.java.excercise.Asignment2;

import java.util.Random;

public class Bee {
    private String type;
    private byte health;
    private boolean alive = true;

    public Bee() {
        this.health = 100;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getHealth() {
        return this.health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void damage() {
        byte[] dmg = new byte[1];
        do{
            Random random = new Random();
            random.nextBytes(dmg);
        } while (dmg[0] > this.getHealth() || dmg[0] < 0);
        if (!this.isAlive() == false) {
            this.health -= dmg[0];
        }
    }

    @Override
    public String toString() {
        String beeDetails = "Bee details";
        beeDetails += "\n {type: " + this.type + "health: " + this.health + "alive: " + this.alive + "}";
        return  beeDetails;
    }
}
