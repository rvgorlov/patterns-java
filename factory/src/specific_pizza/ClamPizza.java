package specific_pizza;

import IngridientFactory_interface.PizzaIngridienFactory;
import pizza_interface.Pizza;

/**
 * Created by rvgorlov on 11.07.16.
 */
public class ClamPizza extends Pizza {
    PizzaIngridienFactory ingridienFactory;

    public ClamPizza(PizzaIngridienFactory ingridienFactory){
        this.ingridienFactory = ingridienFactory;
    }

    public void prepare(){
        System.out.printf("Preparing " + name);
        dough = ingridienFactory.createDough();
        sauce = ingridienFactory.createSauce();
        cheese = ingridienFactory.createCheeze();
    }

}
