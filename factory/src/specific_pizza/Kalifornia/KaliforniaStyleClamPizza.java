package specific_pizza.Kalifornia;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class KaliforniaStyleClamPizza extends Pizza {
    public KaliforniaStyleClamPizza () {
        this.name = "Kalifornia Style Clam Pizza";
        /*this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Clam");*/
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
