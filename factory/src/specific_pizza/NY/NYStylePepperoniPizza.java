package specific_pizza.NY;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza () {
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Pepperoni");
    }
}
