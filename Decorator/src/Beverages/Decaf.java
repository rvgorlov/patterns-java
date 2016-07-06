package Beverages;

import AbstractClass.Beverage;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class Decaf extends Beverage{
    public Decaf () {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
