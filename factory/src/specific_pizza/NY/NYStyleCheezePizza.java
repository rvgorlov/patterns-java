package specific_pizza.NY;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYStyleCheezePizza extends Pizza{
    public NYStyleCheezePizza () {
        this.name = "NY Style Cheeze Pizza";
        /*this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Cheeze");*/
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
