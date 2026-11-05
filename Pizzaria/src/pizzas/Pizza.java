package pizzas;

import ingredientes.*;

public abstract class Pizza {

    protected String name;
    protected Massa dough;
    protected Molho sauce;
    protected Queijo cheese;
    protected Vegetais[] veggies;
    protected Pepperoni pepperoni;
    protected Mariscos clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Assando por 25 minutos a 180 graus.");
    }

    public void cut() {
        System.out.println("Cortando a pizza em fatias diagonais.");
    }

    public void box() {
        System.out.println("Colocando a pizza na caixa.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
