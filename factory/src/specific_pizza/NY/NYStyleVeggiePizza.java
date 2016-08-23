package specific_pizza.NY;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza () {
        this.name = "NY Style Veggie Pizza";
        /*this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Veggie");*/
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
