package practice_strategy;

public class ModelDuck extends Duck{

    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display()
    {
       System.out.println("I'm decoy duck");
    }
}
