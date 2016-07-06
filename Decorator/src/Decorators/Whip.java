package Decorators;

import AbstractClass.Beverage;
import AbstractClass.CondimentDecorator;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
