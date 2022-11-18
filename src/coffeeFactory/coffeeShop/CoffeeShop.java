package coffeeFactory.coffeeShop;

import coffeeFactory.cofee.Coffee;
import coffeeFactory.typeEnum.CoffeeType;

/**
 * абстрактний клас CoffeeShop
 * має один абстрактний метод createCoffee
 * та метод orderCoffee
 */
public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Please, enjoy your "+type);
        return coffee;
    }

    public abstract Coffee createCoffee(CoffeeType type);
}
