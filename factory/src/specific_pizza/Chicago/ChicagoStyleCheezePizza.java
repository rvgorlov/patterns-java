package specific_pizza.Chicago;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class ChicagoStyleCheezePizza extends Pizza {
    public ChicagoStyleCheezePizza () {
        this.name = "Chicago Style Cheeze Pizza";
        //this.dough = "Thin Crust Dough";
        //this.sauce = "Marina Souce";

        //toppings.add("Grated Reggino Cheese")
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
