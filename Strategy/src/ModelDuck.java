/**
 * Created by rvgorlov on 03.07.16.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.printf("I'm a model duck\n");
    }
}
