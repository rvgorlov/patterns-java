/**
 * Created by rvgorlov on 03.07.16.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;        // ссылочные переменные для объектов которые будут
    QuackBehavior quackBehavior;    // определять поведение

    public Duck () {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void  swim (){
        System.out.printf("All duck flout, even decoys!\n");
    }


    // сеттеры позволяют изменять на лету поведение объектов DUCK
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void  setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
