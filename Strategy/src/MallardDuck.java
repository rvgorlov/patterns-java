/**
 * Created by rvgorlov on 03.07.16.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.printf("I'm a real Mallard duck\n");
    }
}
