package CoffeeProgramme;

/**
 * Created by student on 8/26/2016.
 */
import org.junit.*;

public class CafeTest {
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;
    public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();

    private Cafe cafe;

    @Before //before testing
    public void before() {
        cafe = new Cafe();
    }

    //check wether we can brew espresso
    @Test
    public void canBrewEspresso() {
        //GIVEN - DO WE HAVE ENOUGH BEANS
        withBeans();

        //WHEN - ITS HAPPENING
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //THEN - DO WE HAVE AN ESPRESSO
        //1 - Is it an espresso
        Assert.assertEquals("Wrong Coffee Type", CoffeeType.Espresso, coffee.getType());
    }

    public void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }

}
