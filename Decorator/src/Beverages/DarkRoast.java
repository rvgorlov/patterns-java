package Beverages;

import AbstractClass.Beverage;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class DarkRoast extends Beverage {
    public DarkRoast () {
        description = "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
