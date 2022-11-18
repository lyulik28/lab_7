package coffeeFactory;

import coffeeFactory.cofee.Coffee;
import coffeeFactory.coffeeShop.CoffeeShop;
import coffeeFactory.coffeeShop.EnglishCoffeeShop;
import coffeeFactory.coffeeShop.SpanishCoffeeShop;
import coffeeFactory.typeEnum.CoffeeType;

/**
 * "точка запуска" програми
 * у методі main створюються нові об'єкти
 * створюються статичні класи, що є нащадками Coffee
 */
public class Main {
    public static void main(String[] args) {
        CoffeeShop spanishCoffeeShop = new SpanishCoffeeShop();
        spanishCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        CoffeeShop englishCoffeeShop = new EnglishCoffeeShop();
        englishCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }

    public static class SpanishStyleAmericano extends Coffee {}
    public static class SpanishStyleCappuccino extends Coffee {}
    public static class SpanishStyleCaffeLatte extends Coffee {}
    public static class SpanishStyleEspresso extends Coffee {}

    public static class EnglishStyleAmericano extends Coffee {}
    public static class EnglishStyleCappuccino extends Coffee {}
    public static class EnglishStyleCaffeLatte extends Coffee {}
    public static class EnglishStyleEspresso extends Coffee {}
}