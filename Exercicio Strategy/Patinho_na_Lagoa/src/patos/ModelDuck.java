
package patos;

import quacks.Quack;
import quacks.QuackBehavior;
import voos.FlyBehavior;
import voos.FlyNoWay;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
