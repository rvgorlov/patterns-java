package specific_pizza.Kalifornia;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class KaliforniaStylePepperoniPizza extends Pizza {
    public KaliforniaStylePepperoniPizza () {
        this.name = "Kalifornia Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Pepperoni");
    }
}
