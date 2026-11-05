package pizzas;

import fabricas.PizzaIngredientFactory;

public class PizzaQueijo extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public PizzaQueijo(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando: " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("Ingredientes utilizados:");
        System.out.println(dough);
        System.out.println(sauce);
        System.out.println(cheese);
    }
}
