package fmt.application;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMenu {
    private Map<Integer, Coffee> coffeeMenu;

    public CoffeeMenu() {
        coffeeMenu = new HashMap<>();
        coffeeMenu.put(1, new Coffee("Espresso", 20, new Recipe(getEspressoIngredients())));
        coffeeMenu.put(2, new Coffee("Double Espresso", 29, new Recipe(getDoubleEspressoIngredients())));
        coffeeMenu.put(3, new Coffee("Cappuccino", 27, new Recipe(getCappuccinoIngredients())));
        coffeeMenu.put(4, new Coffee("Caffe Latte", 27, new Recipe(getCaffeLatteIngredients())));
        coffeeMenu.put(5, new Coffee("Mocha", 32, new Recipe(getMochaIngredients())));
        coffeeMenu.put(6, new Coffee("Americano", 25, new Recipe(getAmericanoIngredients())));
        coffeeMenu.put(7, new Coffee("Hot Water", 5, new Recipe(getHotWaterIngredients())));
    }

    public void displayMenu() {
        System.out.println("Kahve Menüsü:");
        for (Map.Entry<Integer, Coffee> entry : coffeeMenu.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public Coffee getCoffee(int coffeeNumber) {
        return coffeeMenu.get(coffeeNumber);
    }

    private static Map<String, Integer> getEspressoIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);
        return ingredients;
    }

    private static Map<String, Integer> getDoubleEspressoIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 2);
        return ingredients;
    }

    private static Map<String, Integer> getCappuccinoIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);
        ingredients.put("Sıcak Süt", 2);
        ingredients.put("Süt Köpüğü", 2);
        return ingredients;
    }

    private static Map<String, Integer> getCaffeLatteIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);
        ingredients.put("Sıcak Süt", 3);
        ingredients.put("Süt Köpüğü", 1);
        return ingredients;
    }

    private static Map<String, Integer> getMochaIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);
        ingredients.put("Sıcak Süt", 1);
        ingredients.put("Süt Köpüğü", 1);
        ingredients.put("Sıcak Çikolata", 2);
        return ingredients;
    }

    private static Map<String, Integer> getAmericanoIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);
        ingredients.put("Sıcak Su", 4);
        return ingredients;
    }

    private static Map<String, Integer> getHotWaterIngredients() {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Sıcak Su", 5);
        return ingredients;
    }
}
