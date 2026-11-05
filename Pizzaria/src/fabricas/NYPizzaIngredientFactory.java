package fabricas;

import ingredientes.*;
import ingredientes.concretos.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Massa createDough() {
        return new MassaFina();
    }

    @Override
    public Molho createSauce() {
        return new MolhoMarinara();
    }

    @Override
    public Queijo createCheese() {
        return new QueijoReggiano();
    }

    @Override
    public Vegetais[] createVeggies() {
        return new Vegetais[] {
            new Alho(), new Cebola(), new Cogumelo(), new Pimentao()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniFatiado();
    }

    @Override
    public Mariscos createClam() {
        return new MariscosFrescos();
    }
}
