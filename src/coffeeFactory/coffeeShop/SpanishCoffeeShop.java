package coffeeFactory.coffeeShop;

import coffeeFactory.Main;
import coffeeFactory.cofee.Coffee;
import coffeeFactory.typeEnum.CoffeeType;

/**
 * клас SpanishCoffeeShop, що є нащадком CoffeeShop
 * змінює функцію createCoffee
 */
public class SpanishCoffeeShop extends CoffeeShop {

    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new Main.SpanishStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new Main.SpanishStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new Main.SpanishStyleCappuccino();
                break;
            case LATTE:
                coffee = new Main.SpanishStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
