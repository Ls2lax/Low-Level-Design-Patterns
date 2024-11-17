package Decorator;

public class Caramel extends IngredientDecorator{
    Beverage beverage;
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 5;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " With Caramel";
    }
}
