package coffeeFactory.coffeeShop;

import coffeeFactory.Main;
import coffeeFactory.cofee.Coffee;
import coffeeFactory.typeEnum.CoffeeType;

/**
 * клас EnglishCoffeeShop, що є нащадком CoffeeShop
 * змінює функцію createCoffee
 */
public class EnglishCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Main.EnglishStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new Main.EnglishStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new Main.EnglishStyleCappuccino();
                break;
            case LATTE:
                coffee = new Main.EnglishStyleCaffeLatte();
                break;
        }

        return coffee;
    }
}
