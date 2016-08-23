import pizza_story.*;

public class test_code {

    public static void main(String[] args) {
        PizzaStory nyPizzaStory = new NYPizzaStory();
        nyPizzaStory.orderPizza("Cheeze");

        PizzaStory chicagoPizzaStory = new ChicagoPizzaStory();
        chicagoPizzaStory.orderPizza("Clam");
    }
}
