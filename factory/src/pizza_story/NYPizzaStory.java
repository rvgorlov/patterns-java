package pizza_story;

import pizza_interface.Pizza;
import specific_pizza.NY.NYStyleCheezePizza;
import specific_pizza.NY.NYStyleClamPizza;
import specific_pizza.NY.NYStylePepperoniPizza;
import specific_pizza.NY.NYStyleVeggiePizza;


/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYPizzaStory extends PizzaStory{
     Pizza createPizza(String type){
        if (type.equals("Cheeze")) {
            return new NYStyleCheezePizza();
        } else if (type.equals("Pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("Clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("Veggie")){
            return new NYStyleVeggiePizza();
        } else
            return null;
    }
}
