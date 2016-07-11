package pizza_story;

import pizza_interface.Pizza;
import specific_pizza.Chicago.ChicagoStyleCheezePizza;
import specific_pizza.Chicago.ChicagoStyleClamPizza;
import specific_pizza.Chicago.ChicagoStylePepperoniPizza;
import specific_pizza.Chicago.ChicagoStyleVeggiePizza;


/**
 * Created by rvgorlov on 11.07.16.
 */
public class ChicagoPizzaStory extends PizzaStory{
    Pizza createPizza(String type){
        if (type.equals("Cheeze")) {
            return new ChicagoStyleCheezePizza();
        } else if (type.equals("Pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("Clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("Veggie")){
            return new ChicagoStyleVeggiePizza();
        } else
            return null;
    }
}
