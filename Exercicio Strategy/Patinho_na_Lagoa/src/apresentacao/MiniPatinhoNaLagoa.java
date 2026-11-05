package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import patos.ModelDuck;
import voos.FlyRocketPowered;
public class MiniPatinhoNaLagoa {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior (new FlyRocketPowered());
        model.performFly();
        
    }
}
