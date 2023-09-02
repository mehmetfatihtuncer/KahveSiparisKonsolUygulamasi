package fmt.application;


public class Coffee {
    private String name;
    private int price;
    private Recipe recipe;

    public Coffee(String name, int price, Recipe recipe) {
        this.name = name;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return name + " - " + price + " ₺";
    }
}
