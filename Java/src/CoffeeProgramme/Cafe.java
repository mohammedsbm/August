package CoffeeProgramme;

/**
 * Created by student on 8/26/2016.
 */
public class Cafe {
    private int beansInStock = 0;
    private int milkInStock = 0;

    //method overload
    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        requiredPositive(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if(requiredBeans > beansInStock || requiredMilk > milkInStock)
            throw new IllegalStateException("Insufficient beans or milk");

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }

    public void requiredPositive(int value) {
        if(value < 1)
            throw new IllegalArgumentException();
    }

    public void restockBeans(int weightInGrams) {
        requiredPositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requiredPositive(weightInGrams);
        milkInStock += weightInGrams;
    }
}
