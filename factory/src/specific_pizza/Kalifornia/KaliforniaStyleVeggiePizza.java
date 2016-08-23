package specific_pizza.Kalifornia;

import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class KaliforniaStyleVeggiePizza extends Pizza {
    public KaliforniaStyleVeggiePizza () {
        this.name = "Kalifornia Style Veggi Pizza";
        /*this.dough = "Thin Crust Dough";
        this.sauce = "Marina Souce";

        toppings.add("Grated Reggino Veggi");*/
    }

    public void prepare() {
        System.out.printf("Preparing " + this.name);

    }
}
