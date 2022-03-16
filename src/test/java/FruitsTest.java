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

        multilayerBowl.getAllFruitsByRedColor();
        multilayerBowl.getAllFruitsByGreenColor();

        Assert.assertEquals(multilayerBowl.getAllFruitsByGreenColor(),2);
        Assert.assertEquals(multilayerBowl.getAllFruitsByRedColor(),2);
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

        multilayerBowl.getAllFruitsBySmallSize();
        multilayerBowl.getAllFruitsByMediumSize();

        Assert.assertEquals(multilayerBowl.getAllFruitsBySmallSize(),1);
        Assert.assertEquals(multilayerBowl.getAllFruitsByMediumSize(),3);
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

        multilayerBowl.getAllFruitsBySourType();
        multilayerBowl.getAllFruitsBySweetType();

        Assert.assertEquals(multilayerBowl.getAllFruitsBySourType(),3);
        Assert.assertEquals(multilayerBowl.getAllFruitsBySweetType(),1);
    }
}
