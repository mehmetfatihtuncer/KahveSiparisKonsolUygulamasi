package fmt.application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.displayMenu();

        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
			int selectedCoffeeNumber = scan.nextInt();

			Coffee selectedCoffee = coffeeMenu.getCoffee(selectedCoffeeNumber);

			displayOrder(selectedCoffee);

		}
    }

    private static void displayOrder(Coffee coffee) {
        System.out.println(coffee.getName() + " seçtiniz. " + coffee.getRecipe() + "Afiyet Olsun.");
    }
}
