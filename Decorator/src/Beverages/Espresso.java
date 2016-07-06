package Beverages;
import AbstractClass.Beverage;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
