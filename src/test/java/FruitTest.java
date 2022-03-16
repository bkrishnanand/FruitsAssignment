import com.ultralesson.objectorientation.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FruitTest {

  @Test
  public void segregateFruitsByName() {
    Fruit fruit1 = new Fruit("Apple", "Red", "Medium", "Sweet");
    Fruit fruit2 = new Fruit("Apple", "Green", "Small", "Sour");
    Fruit fruit3 = new Fruit("Orange", "yellow", "Medium", "Sour");
    Fruit fruit4 = new Fruit("Orange", "Green", "Medium", "Sour");

    List<Fruit> fruits = Arrays.asList(fruit1, fruit2, fruit3, fruit4);

    MultilayerBowl multilayerBowl = new MultilayerBowl();

    Segregator segregator = new Segregator(fruits, multilayerBowl);
    MultilayerBowl segregatedBowl = segregator.segregateByName();
    System.out.println(segregatedBowl);

    Optional<Bowl> matchingBowl =
        segregatedBowl.getMatchingBowl(FruitPredicates.namePredicate(fruit1));
    Assert.assertTrue(matchingBowl.isPresent());
    boolean allFruitsInBowlMatches =
        matchingBowl.get().getFruits().stream()
            .allMatch(fruit -> fruit.getName().equals(fruit1.getName()));
    Assert.assertTrue(allFruitsInBowlMatches);
    Assert.assertEquals(2, matchingBowl.get().getFruits().size());
  }

  @Test
  public void segregateFruitsByColor() {
    Fruit fruit1 = new Fruit("Apple", "Red", "Medium", "Sweet");
    Fruit fruit2 = new Fruit("Apple", "Green", "Small", "Sour");
    Fruit fruit3 = new Fruit("Orange", "yellow", "Medium", "Sour");
    Fruit fruit4 = new Fruit("Orange", "Green", "Medium", "Sour");

    List<Fruit> fruits = Arrays.asList(fruit1, fruit2, fruit3, fruit4);

    MultilayerBowl multilayerBowl = new MultilayerBowl();

    Segregator segregator = new Segregator(fruits, multilayerBowl);
    MultilayerBowl segregatedBowl = segregator.segregateByColor();
    System.out.println(segregatedBowl);

    Optional<Bowl> matchingBowl =
            segregatedBowl.getMatchingBowl(FruitPredicates.colorPredicate(fruit1));
    Assert.assertTrue(matchingBowl.isPresent());
    boolean allFruitsInBowlMatches =
            matchingBowl.get().getFruits().stream()
                    .allMatch(fruit -> fruit.getColor().equals(fruit1.getColor()));
    Assert.assertTrue(allFruitsInBowlMatches);
    Assert.assertEquals(1, matchingBowl.get().getFruits().size());
  }

  @Test
  public void segregateFruitsByType() {
    Fruit fruit1 = new Fruit("Apple", "Red", "Medium", "Sweet");
    Fruit fruit2 = new Fruit("Apple", "Green", "Small", "Sour");
    Fruit fruit3 = new Fruit("Orange", "yellow", "Medium", "Sour");
    Fruit fruit4 = new Fruit("Orange", "Green", "Medium", "Sour");

    List<Fruit> fruits = Arrays.asList(fruit1, fruit2, fruit3, fruit4);

    MultilayerBowl multilayerBowl = new MultilayerBowl();

    Segregator segregator = new Segregator(fruits, multilayerBowl);
    MultilayerBowl segregatedBowl = segregator.segregateByType();
    System.out.println(segregatedBowl);
    //
    Optional<Bowl> matchingBowl =
            segregatedBowl.getMatchingBowl(FruitPredicates.typePredicate(fruit2));
    Assert.assertTrue(matchingBowl.isPresent());
    boolean allFruitsInBowlMatches =
            matchingBowl.get().getFruits().stream()
                    .allMatch(fruit -> fruit.getType().equals(fruit2.getType()));
    Assert.assertTrue(allFruitsInBowlMatches);
    Assert.assertEquals(3, matchingBowl.get().getFruits().size());
  }

  @Test
  public void segregateFruitsBySize() {
    Fruit fruit1 = new Fruit("Apple", "Red", "Medium", "Sweet");
    Fruit fruit2 = new Fruit("Apple", "Green", "Small", "Sour");
    Fruit fruit3 = new Fruit("Orange", "yellow", "Medium", "Sour");
    Fruit fruit4 = new Fruit("Orange", "Green", "Medium", "Sour");

    List<Fruit> fruits = Arrays.asList(fruit1, fruit2, fruit3, fruit4);

    MultilayerBowl multilayerBowl = new MultilayerBowl();

    Segregator segregator = new Segregator(fruits, multilayerBowl);
    MultilayerBowl segregatedBowl = segregator.segregateBySize();
    System.out.println(segregatedBowl);
    //
    Optional<Bowl> matchingBowl =
            segregatedBowl.getMatchingBowl(FruitPredicates.sizePredicate(fruit1));
    Assert.assertTrue(matchingBowl.isPresent());
    boolean allFruitsInBowlMatches =
            matchingBowl.get().getFruits().stream()
                    .allMatch(fruit -> fruit.getSize().equals(fruit1.getSize()));
    Assert.assertTrue(allFruitsInBowlMatches);
    Assert.assertEquals(3, matchingBowl.get().getFruits().size());
  }
}
