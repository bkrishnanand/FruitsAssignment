package com.ultralesson.objectorientation;

public class Fruits {
    String color;
    String size;
    String type;

    public Fruits(String color, String size, String type){
        this.color=color;
        this.size=size;
        this.type=type;
    }

    public String color() {
        return color;
    }


    public String size() {
        return size;
    }


    public String type() {
        return type;
    }
}