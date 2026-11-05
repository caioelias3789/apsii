package fabricas;

import ingredientes.*;

public interface PizzaIngredientFactory {
    Massa createDough();
    Molho createSauce();
    Queijo createCheese();
    Vegetais[] createVeggies();
    Pepperoni createPepperoni();
    Mariscos createClam();
}
