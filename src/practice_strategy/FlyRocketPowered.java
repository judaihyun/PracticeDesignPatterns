package practice_strategy;

public class FlyRocketPowered implements FlyBehavior {
   @Override
   public void fly()
   {
      System.out.println("I'm flying a rocket");
   };
}
