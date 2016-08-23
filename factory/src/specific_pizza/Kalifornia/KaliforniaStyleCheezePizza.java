package specific_pizza.Kalifornia;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class KaliforniaStyleCheezePizza extends Pizza {
    public KaliforniaStyleCheezePizza () {
        this.name = "Kalifornia Style Cheeze Pizza";
        /*this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Cheeze");*/
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
