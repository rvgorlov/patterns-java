package specific_pizza.Chicago;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza () {
        this.name = "Chicago Style Clam Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Clam");
    }
}
