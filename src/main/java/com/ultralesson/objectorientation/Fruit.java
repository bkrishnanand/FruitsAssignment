package com.ultralesson.objectorientation;

// Avoid using plural class names
//TODO: Fruits -> Fruit
public class Fruit {
    // Follow encapsulation, make all variables private.
    private String color;
    private String size;
    private String type;

    //Missing field type name of fruit
    private String name;

    public Fruit(String name, String color, String size, String type){
        this.name = name;
        this.color=color;
        this.size=size;
        this.type=type;
    }

    // TODO: Use getters and setters for methods on properties

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "{"
                + "\"color\":\"" + color + "\""
                + ", \"size\":\"" + size + "\""
                + ", \"type\":\"" + type + "\""
                + ", \"name\":\"" + name + "\""
                + "}";
    }
}