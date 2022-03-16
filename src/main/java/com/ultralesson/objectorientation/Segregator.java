package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class Segregator extends Bowl{

    public List segregateByColor(String color){
        List<Fruits> fruitColor = new ArrayList<Fruits>();
        for (int i=0;i<fruits.size();i++){
            if (fruits.get(i).color().equalsIgnoreCase(color)){
               fruitColor.add(fruits.get(i));
            }
        }
        return fruitColor;
    }


    public List segregateBySize(String size){
        List<Fruits> fruitSize = new ArrayList<Fruits>();
        for (int i=0;i<fruits.size();i++){
            if (fruits.get(i).size().equalsIgnoreCase(size)){
                fruitSize.add(fruits.get(i));
            }
        }
        return fruitSize;
    }

    public List segregateByType(String type){
        List<Fruits> fruitType = new ArrayList<Fruits>();
        for (int i=0;i<fruits.size();i++){
            if (fruits.get(i).type().equalsIgnoreCase(type)){
                fruitType.add(fruits.get(i));
            }
        }
        return fruitType;
    }

}

