package com.java.com.java.oop;

//object is similar to real object, its has : state and behavior
//encapsulation : hiding internal state and requiring all interaction
// to be performed through an object's method
//below is an example of dog object :)

public class Object {
    //state
    private String color;
    private String name;
    private int leg;
    boolean waggingTail;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return this.leg;
    }

    public void setWaggingTail(boolean waggingTail) {
        this.waggingTail = waggingTail;
    }

    public boolean getWaggingTail() {
        return this.waggingTail;
    }
}
