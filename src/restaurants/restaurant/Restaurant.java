package restaurants.restaurant;

import restaurants.meal.Meal;
import restaurants.menu.Menu;

/**
 * абстрактний клас Restaurant
 */
public abstract class Restaurant {
    public Meal orderMeal(Menu type){
        Meal meal = makeMeal(type);

        meal.cookMeal();
        meal.serveMeal();

        System.out.println("Enjoy your meal!");
        return meal;
    }

    public abstract Meal makeMeal(Menu type);
}
