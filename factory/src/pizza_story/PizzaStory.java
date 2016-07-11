package pizza_story;

import factory.SimplePizzaFactory;
import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public abstract class PizzaStory {
    //SimplePizzaFactory factory;

    /*public PizzaStory(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    public final Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
 }
