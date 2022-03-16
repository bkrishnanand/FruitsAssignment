package com.ultralesson.objectorientation;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitPredicates {


  public static Predicate<Fruit> namePredicate(Fruit fruit) {
    return f -> f.getName().equalsIgnoreCase(fruit.getName());
  }

  public static Predicate<Fruit> colorPredicate(Fruit fruit) {
    return f -> f.getColor().equalsIgnoreCase(fruit.getColor());
  }

  public static Predicate<Fruit> sizePredicate(Fruit fruit) {
    return f -> f.getSize().equalsIgnoreCase(fruit.getSize());
  }

  public static Predicate<Fruit> typePredicate(Fruit fruit) {
    return f -> f.getType().equalsIgnoreCase(fruit.getType());
  }
}
