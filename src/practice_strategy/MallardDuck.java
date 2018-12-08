package practice_strategy;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display()
    {
        System.out.println("I'M a real Mallard duck");
    }
}
