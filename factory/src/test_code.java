import pizza_interface.Pizza;
import pizza_story.ChicagoPizzaStory;
import pizza_story.KaliforniaPizzaStory;
import pizza_story.NYPizzaStory;
import pizza_story.PizzaStory;

public class test_code {

    public static void main(String[] args) {
        PizzaStory NYpizzaStory = new NYPizzaStory();
        Pizza pizza = NYpizzaStory.orderPizza("Veggie");

        PizzaStory KalPizzaStory = new KaliforniaPizzaStory();
        pizza = KalPizzaStory.orderPizza("Veggie");

        PizzaStory chicagoPizzaStory = new ChicagoPizzaStory();
        pizza = chicagoPizzaStory.orderPizza("Veggie");

    }
}
