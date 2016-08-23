package factory;

import IngridientFactory_interface.PizzaIngridienFactory;
import ingridients.*;

/**
 * Created by rvgorlov on 03.08.16.
 */
public class NYPizzaIngredientFactory implements PizzaIngridienFactory{

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheeze(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies(){
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClam() {
        return new FreashClums();
    }
}
