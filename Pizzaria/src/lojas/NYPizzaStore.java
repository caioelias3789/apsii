package lojas;

import fabricas.NYPizzaIngredientFactory;
import fabricas.PizzaIngredientFactory;
import pizzas.Pizza;
import pizzas.PizzaQueijo;
import pizzas.PizzaVegetariana;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        Pizza pizza = null;

        if (type.equalsIgnoreCase("queijo")) {

            pizza = new PizzaQueijo(ingredientFactory);

            pizza.setName("Pizza de Queijo de Nova York");

        } else if (type.equalsIgnoreCase("vegetariana")) {

            pizza = new PizzaVegetariana(ingredientFactory);

            pizza.setName("Pizza Vegetariana de Nova York");

        }

        return pizza;
    }
}