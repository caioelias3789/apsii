package lojas;

import fabricas.ChicagoPizzaIngredientFactory;
import fabricas.PizzaIngredientFactory;
import pizzas.Pizza;
import pizzas.PizzaQueijo;
import pizzas.PizzaVegetariana;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;

        if (type.equalsIgnoreCase("queijo")) {

            pizza = new PizzaQueijo(ingredientFactory);

            pizza.setName("Pizza de Queijo de Chicago");

        } else if (type.equalsIgnoreCase("vegetariana")) {

            pizza = new PizzaVegetariana(ingredientFactory);

            pizza.setName("Pizza Vegetariana de Chicago");

        }

        return pizza;
    }
}