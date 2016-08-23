package pizza_story;

import IngridientFactory_interface.PizzaIngridienFactory;
import factory.NYPizzaIngredientFactory;
import pizza_interface.Pizza;
import specific_pizza.CheezePizza;
import specific_pizza.ClamPizza;
import specific_pizza.NY.NYStyleCheezePizza;
import specific_pizza.NY.NYStyleClamPizza;
import specific_pizza.NY.NYStylePepperoniPizza;
import specific_pizza.NY.NYStyleVeggiePizza;
import specific_pizza.PepperoniPizza;
import specific_pizza.VeggiePizza;


/**
 * Created by rvgorlov on 11.07.16.
 */
public class NYPizzaStory extends PizzaStory{

    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngridienFactory ingridienFactory = new NYPizzaIngredientFactory();

        if (type.equals("Cheeze")) {
            pizza = new CheezePizza(ingridienFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza(ingridienFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("Clam")) {
            pizza = new ClamPizza(ingridienFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("Veggie")){
            pizza = new VeggiePizza(ingridienFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
