package restaurants.restaurant;

import restaurants.Main;
import restaurants.meal.Meal;
import restaurants.menu.Menu;

/**
 * клас ItalianRestaurant, нащадок Restaurant
 */
public class ItalianRestaurant extends Restaurant{
    @Override
    public Meal makeMeal(Menu type){
        Meal meal = null;

        switch (type){
            case SOUP:
                meal = new Main.ItalianSoup();
                break;
            case MAIN_DISH:
                meal = new Main.ItalianDish();
                break;
            case SNACK:
                meal = new Main.ItalianSnack();
                break;
            case DRINK:
                meal = new Main.ItalianDrink();
                break;
        }
        return meal;
    }
}
