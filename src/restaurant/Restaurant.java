package restaurant;

import Dish.Salad;
import staff.Chef;

public class Restaurant
{
    public static void main(String[] args) {
        Chef bob = new Chef();
        Salad carrotSalad = bob.cook("carrot", "oil");
        Salad vegetablesSalad = bob.cook("vegetables","sourcream");
        Salad greekSalad = bob.cook("tomato","mozarella");


        System.out.println(carrotSalad.getIngredients());
        System.out.println(vegetablesSalad.getIngredients());
        System.out.println(greekSalad.getIngredients());

        bob.walk();


    }
}
