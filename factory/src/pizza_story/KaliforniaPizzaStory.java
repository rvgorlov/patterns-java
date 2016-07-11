package pizza_story;

import pizza_interface.Pizza;
import specific_pizza.Kalifornia.KaliforniaStyleCheezePizza;
import specific_pizza.Kalifornia.KaliforniaStyleClamPizza;
import specific_pizza.Kalifornia.KaliforniaStylePepperoniPizza;
import specific_pizza.Kalifornia.KaliforniaStyleVeggiePizza;


/**
 * Created by rvgorlov on 11.07.16.
 */
public class KaliforniaPizzaStory extends PizzaStory{
    Pizza createPizza(String type){
        if (type.equals("Cheeze")) {
            return new KaliforniaStyleCheezePizza();
        } else if (type.equals("Pepperoni")) {
            return new KaliforniaStylePepperoniPizza();
        } else if (type.equals("Clam")) {
            return new KaliforniaStyleClamPizza();
        } else if (type.equals("Veggie")){
            return new KaliforniaStyleVeggiePizza();
        } else
            return null;
    }
}
