package IngridientFactory_interface;

import ingridients.*;

/**
 * Created by rvgorlov on 13.07.16.
 */
public interface PizzaIngridienFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheeze();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
