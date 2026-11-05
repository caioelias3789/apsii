package pizzas;

import fabricas.PizzaIngredientFactory;

public class PizzaVegetariana extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public PizzaVegetariana(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

        System.out.println("Preparando: " + name);

        dough = ingredientFactory.createDough();

        sauce = ingredientFactory.createSauce();

        cheese = ingredientFactory.createCheese();

        veggies = ingredientFactory.createVeggies();

        System.out.println("Ingredientes utilizados:");

        System.out.println(dough);

        System.out.println(sauce);

        System.out.println(cheese);

        for (int i = 0; i < veggies.length; i++) {
            System.out.println(veggies[i]);
        }
    }
}