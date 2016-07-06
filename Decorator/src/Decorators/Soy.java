package Decorators;

import AbstractClass.Beverage;
import AbstractClass.CondimentDecorator;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}