package fmt.application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.displayMenu();

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");

            
            while (true) {
                if (scan.hasNextInt()) { // Kullanıcı bir tamsayı girdi mi?
                    int selectedCoffeeNumber = scan.nextInt();

                    // Geçerli kahve numarası kontrolü
                    if (selectedCoffeeNumber >= 1 && selectedCoffeeNumber <= 7) {
                        Coffee selectedCoffee = coffeeMenu.getCoffee(selectedCoffeeNumber);

                        System.out.println("Teşekkürler kahveniz hazırlanıyor.");
                        displayOrder(selectedCoffee);
                        break;
                    } else {
                        System.out.println("Geçersiz kahve numarası seçildi. Lütfen 1 ile 7 arasında bir numara girin.");
                    }
                } else {
                    System.out.println("Geçersiz giriş. Lütfen bir tamsayı girin.");
                    scan.next(); // Geçersiz girişi temizler
                }
            }
        }
    }

    private static void displayOrder(Coffee coffee) {
        System.out.println(coffee.getName() + " seçtiniz. " + coffee.getRecipe() + "Afiyet Olsun.");
    }
}
