package restaurants.restaurant;

import restaurants.Main;
import restaurants.meal.Meal;
import restaurants.menu.Menu;

/**
 * клас ChineseRestaurant, нащадок Restaurant
 */
public class ChineseRestaurant extends Restaurant{
    @Override
    public Meal makeMeal(Menu type){
        Meal meal = null;

        switch (type){
            case SOUP:
                meal = new Main.ChineseSoup();
                break;
            case MAIN_DISH:
                meal = new Main.ChineseDish();
                break;
            case SNACK:
                meal = new Main.ChineseSnack();
                break;
            case DRINK:
                meal = new Main.ChineseDrink();
                break;
        }
        return meal;
    }
}
