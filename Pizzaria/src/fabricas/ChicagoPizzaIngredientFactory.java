package fabricas;

import ingredientes.*;
import ingredientes.concretos.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Massa createDough() {
        return new MassaGrossa();
    }

    @Override
    public Molho createSauce() {
        return new MolhoTomate();
    }

    @Override
    public Queijo createCheese() {
        return new QueijoMozzarella();
    }

    @Override
    public Vegetais[] createVeggies() {
        return new Vegetais[] {
            new Azeitona(), new Espinafre(), new Berinjela()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniFatiado();
    }

    @Override
    public Mariscos createClam() {
        return new MariscosCongelados();
    }
}
