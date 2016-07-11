package specific_pizza.Chicago;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza () {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Pepperoni");
    }
}
