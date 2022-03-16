package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class MultilayerBowl extends Segregator{

    public int getAllFruitsByRedColor(){
        List<Fruits> redColorFruit = new ArrayList<Fruits>();
        redColorFruit.addAll(segregateByColor("Red"));
        return redColorFruit.size();
    }

    public int getAllFruitsByGreenColor(){
        List<Fruits> greenColorFruit = new ArrayList<Fruits>();
        greenColorFruit.addAll(segregateByColor("Green"));
        return greenColorFruit.size();
    }

    public int getAllFruitsByMediumSize(){
        List<Fruits> mediumSizeFruit = new ArrayList<Fruits>();
        mediumSizeFruit.addAll(segregateBySize("Medium"));
        return mediumSizeFruit.size();
    }

    public int getAllFruitsBySmallSize(){
        List<Fruits> smallSizeFruit = new ArrayList<Fruits>();
        smallSizeFruit.addAll(segregateBySize("Small"));
        return smallSizeFruit.size();
    }

    public int getAllFruitsBySourType(){
        List<Fruits> sourTypeFruit = new ArrayList<Fruits>();
        sourTypeFruit.addAll(segregateByType("Sour"));
        return sourTypeFruit.size();
    }

    public int getAllFruitsBySweetType(){
        List<Fruits> sweetTypeFruit = new ArrayList<Fruits>();
        sweetTypeFruit.addAll(segregateByType("Sweet"));
        return sweetTypeFruit.size();
    }

}


