package factory;

import IngridientFactory_interface.PizzaIngridienFactory;
import ingridients.*;

/**
 * Created by rvgorlov on 03.08.16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngridienFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheeze(){
        return new Mozzarella();
    }

    public Veggies[] createVeggies(){
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClam() {
        return new FrozenClums();
    }
}
