package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// How is a multilayer bowl connected to segregator?
// Is segregator a multilayer bowl?
// TODO: Remove the relationship
public class MultilayerBowl {
  private List<Bowl> bowls;

  // number of layers of the bowl; 1 or 2 or 3 etc.
  private int numOfLayers;

  // Default constructor for creating a 3 level bowl
  public MultilayerBowl() {
    this(3);
  }

  // Overloaded constructor to create custom layered bowl
  public MultilayerBowl(int numOfLayers) {
    this.numOfLayers = numOfLayers;
    this.bowls = new ArrayList<>();
    initBowls(numOfLayers);
  }

  public MultilayerBowl(int numOfLayers, int bowlThreshold) {
    this.numOfLayers = numOfLayers;
    this.bowls = new ArrayList<>();
    initBowls(numOfLayers);
  }

  // Add Fruit to bowl
  public void add(Bowl bowl, Fruit fruit) {
    bowl.add(fruit);
  }

  // Remove fruit from bowl
  public void remove(Bowl bowl, Fruit fruit) {
    bowl.remove(fruit);
  }

  // Find a matching bowl based on the Segregator requirement
  public Optional<Bowl> getMatchingBowl(Predicate<Fruit> fruitPredicate) {
    return bowls.stream().filter(bowl -> bowl
            .getFruits()
            .stream()
            .allMatch(fruitPredicate)).findFirst();
  }

  public Optional<Bowl> getEmptyBowl() {
    return bowls.stream().filter(bowl -> bowl
            .getFruits()
            .isEmpty()).findFirst();
  }

  private void initBowls(int numOfLayers) {
    initBowls(numOfLayers, 10);
  }

  private void initBowls(int numOfLayers, int bowlThreshold) {
    IntStream.range(0, numOfLayers).forEach(layer -> bowls.add(new Bowl(bowlThreshold)));
  }


    @Override
    public String toString() {
        return "{"
                + "\"bowls\":" + bowls
                + "}";
    }
}
