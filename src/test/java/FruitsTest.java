import com.ultralesson.objectorientation.Bowl;
import com.ultralesson.objectorientation.Fruits;
import com.ultralesson.objectorientation.MultilayerBowl;
import com.ultralesson.objectorientation.Segregator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsTest {

    @Test
    public void getAllFruitsByColor(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Green", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Green", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);

        multilayerBowl.getAllFruitsByRedColorCount();
        multilayerBowl.getAllFruitsByGreenColorCount();

        Assert.assertEquals(multilayerBowl.getAllFruitsByGreenColorCount(),2);
        Assert.assertEquals(multilayerBowl.getAllFruitsByRedColorCount(),2);
    }

    @Test
    public void getAllFruitsBySize(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Green", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Green", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);

        multilayerBowl.getAllFruitsBySmallSizeCount();
        multilayerBowl.getAllFruitsByMediumSizeCount();

        Assert.assertEquals(multilayerBowl.getAllFruitsBySmallSizeCount(),1);
        Assert.assertEquals(multilayerBowl.getAllFruitsByMediumSizeCount(),3);
    }

    @Test
    public void getAllFruitsByType(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Green", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Green", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);

        multilayerBowl.getAllFruitsBySourTypeCount();
        multilayerBowl.getAllFruitsBySweetTypeCount();

        Assert.assertEquals(multilayerBowl.getAllFruitsBySourTypeCount(),3);
        Assert.assertEquals(multilayerBowl.getAllFruitsBySweetTypeCount(),1);
    }
}
