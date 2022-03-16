package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class Bowl {
    static List<Fruits> fruits;

    public Bowl(){
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruits... fruit) {
        for (Fruits allFruits : fruit) {
            fruits.add(allFruits);
        }
    }

}
