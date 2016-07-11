package specific_pizza.NY;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza () {
        this.name = "NY Style Clam Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Clam");
    }
}
