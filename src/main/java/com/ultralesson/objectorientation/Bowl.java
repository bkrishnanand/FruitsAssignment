package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class Bowl {
    // Why static?
    // Using static here, will mean all bowls will have same fruits.
//    static List<Fruit> fruits; //TODO: Avoid static usage
    private List<Fruit> fruits;

    // A bowl should have a certain limit beyond which it should not store the fruits
    private int threashold;

    public Bowl(){
        this(10);
    }

    // Provide a mechanism to overide threashold
    public Bowl(int threashold){
        //Always use this to refer to object variables, this helps avoid ambiguity
        this.fruits = new ArrayList<>(this.threashold);
    }

    //Missing functions

    // Identify if the bowl is full.
    public boolean isFull() {
       return this.fruits.size() == this.threashold;
    }

    // Identify if the bowl is empty
    public boolean isEmpty() {
        return fruits.isEmpty();
    }

    // Avoid the var arg approach as it introduces loop function unnecessarily, override the functionality as required.
//    public void addFruit(Fruit... fruit) {
//        for (Fruit allFruit : fruit) {
//            fruits.add(allFruit);
//        }
//    }

    // Avoid data in the method naming function like addFruit, instead the parameter type will state what gets added.
    public void add(Fruit fruit) {
      this.fruits.add(fruit);
    }

    // Remove the fruit
    public void remove(Fruit fruit) {
        this.fruits.remove(fruit);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "{"
                + "\"fruits\":" + fruits
                + "}";
    }
}
