package com.ultralesson.objectorientation;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

// A segregator takes a list (bowl) of fruits and segregate them based on a certain parameters like size, color, type etc.
public class Segregator {
    private List<Fruit> fruits;
    private MultilayerBowl multilayerBowl;

    // This list of fruits is a mixed fruits, which have to be segregated and placed into a multilayer bowl.
    public Segregator(List<Fruit> fruits, MultilayerBowl multilayerBowl) {
        this.fruits = fruits;
        this.multilayerBowl = multilayerBowl;
    }

    public MultilayerBowl segregateByName() {
        fruits.forEach(
                fruit -> {
                    addToBowl(FruitPredicates.namePredicate(fruit), fruit);
                });
        return multilayerBowl;
    }

    public MultilayerBowl segregateByColor() {
        fruits.forEach(
                fruit -> {
                    addToBowl(FruitPredicates.colorPredicate(fruit), fruit);
                });
        return multilayerBowl;
    }

    public MultilayerBowl segregateByType() {
        fruits.forEach(
                fruit -> {
                    addToBowl(FruitPredicates.typePredicate(fruit), fruit);
                });
        return multilayerBowl;
    }

    public MultilayerBowl segregateBySize() {
        fruits.forEach(
                fruit -> {
                    addToBowl(FruitPredicates.sizePredicate(fruit), fruit);
                });
        return multilayerBowl;
    }

    private void addToBowl(Predicate<Fruit> segregationPredicate, Fruit fruit) {
        Optional<Bowl> matchingBowl = multilayerBowl.getMatchingBowl(segregationPredicate);
        if(matchingBowl.isEmpty()) {
            matchingBowl = multilayerBowl.getEmptyBowl();
        }
        matchingBowl.ifPresent(bowl -> multilayerBowl.add(bowl, fruit));
    }
}

