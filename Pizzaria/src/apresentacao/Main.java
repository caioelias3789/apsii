package apresentacao;

import lojas.ChicagoPizzaStore;
import lojas.NYPizzaStore;
import lojas.PizzaStore;

public class Main {

    public static void main(String[] args) {

        PizzaStore lojaNY = new NYPizzaStore();

        PizzaStore lojaChicago = new ChicagoPizzaStore();

        System.out.println(" NOVA YORK ");

        System.out.println("\n  Pizza de Queijo ");
        lojaNY.orderPizza("queijo");


        System.out.println("\n  CHICAGO ");


        System.out.println("\n Pizza Vegetariana ");
        lojaChicago.orderPizza("vegetariana");

    }
}