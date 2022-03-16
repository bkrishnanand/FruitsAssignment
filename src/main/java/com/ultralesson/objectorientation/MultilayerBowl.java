package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class MultilayerBowl extends Segregator{

    public int getAllFruitsByRedColorCount(){
        List<Fruits> redColorFruit = new ArrayList<Fruits>();
        redColorFruit.addAll(segregateByColor("Red"));
        return redColorFruit.size();
    }

    public int getAllFruitsByGreenColorCount(){
        List<Fruits> greenColorFruit = new ArrayList<Fruits>();
        greenColorFruit.addAll(segregateByColor("Green"));
        return greenColorFruit.size();
    }

    public int getAllFruitsByMediumSizeCount(){
        List<Fruits> mediumSizeFruit = new ArrayList<Fruits>();
        mediumSizeFruit.addAll(segregateBySize("Medium"));
        return mediumSizeFruit.size();
    }

    public int getAllFruitsBySmallSizeCount(){
        List<Fruits> smallSizeFruit = new ArrayList<Fruits>();
        smallSizeFruit.addAll(segregateBySize("Small"));
        return smallSizeFruit.size();
    }

    public int getAllFruitsBySourTypeCount(){
        List<Fruits> sourTypeFruit = new ArrayList<Fruits>();
        sourTypeFruit.addAll(segregateByType("Sour"));
        return sourTypeFruit.size();
    }

    public int getAllFruitsBySweetTypeCount(){
        List<Fruits> sweetTypeFruit = new ArrayList<Fruits>();
        sweetTypeFruit.addAll(segregateByType("Sweet"));
        return sweetTypeFruit.size();
    }

}


