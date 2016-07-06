import AbstractClass.Beverage;
import Beverages.DarkRoast;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Decorators.Mocha;
import Decorators.Whip;

/**
 * Created by rvgorlov on 06.07.16.
 */
public class TestCode {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf(beverage.getDescription() + " $" + beverage.cost() + "\n");

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.printf(beverage1.getDescription() + " $" + beverage1.cost() + "\n");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.printf(beverage2.getDescription() + " $" + beverage2.cost() + "\n");


    }
}
