package Beverages;

import AbstractClass.Beverage;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
