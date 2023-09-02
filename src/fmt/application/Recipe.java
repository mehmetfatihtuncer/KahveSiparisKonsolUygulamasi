package fmt.application;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private Map<String, Integer> ingredients;

    public Recipe(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder orderInfo = new StringBuilder("Bu içeceğimiz ");

        int ingredientCount = 0;
        for (Map.Entry<String, Integer> entry : ingredients.entrySet()) {
            String ingredientName = entry.getKey();
            int ingredientAmount = entry.getValue();

            orderInfo.append(ingredientAmount).append(" doz ").append(ingredientName.toLowerCase());

            if (++ingredientCount < ingredients.size()) {
                orderInfo.append(", ");
            }
        }

        orderInfo.append(" içermektedir. ");
        return orderInfo.toString();
    }
}
