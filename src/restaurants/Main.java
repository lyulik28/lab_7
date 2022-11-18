package restaurants;

import restaurants.meal.Meal;
import restaurants.menu.Menu;
import restaurants.restaurant.ChineseRestaurant;
import restaurants.restaurant.ItalianRestaurant;
import restaurants.restaurant.Restaurant;

/**
 * клас Main
 * запуск програми, створення об'єктів та класів
 */
public class Main {
    public static void main(String[] args) {
        Restaurant spanishCoffeeShop = new ItalianRestaurant();
        spanishCoffeeShop.orderMeal(Menu.MAIN_DISH);

        Restaurant englishCoffeeShop = new ChineseRestaurant();
        englishCoffeeShop.orderMeal(Menu.SNACK);
    }

    public static class ItalianSoup extends Meal{}
    public static class ItalianDish extends Meal{}
    public static class ItalianSnack extends Meal{}
    public static class ItalianDrink extends Meal{}

    public static class ChineseSoup extends Meal{}
    public static class ChineseDish extends Meal{}
    public static class ChineseSnack extends Meal{}
    public static class ChineseDrink extends Meal{}
}