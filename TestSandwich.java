import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for sandwich details
        System.out.print("Enter main ingredient: ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter bread type: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // Create Sandwich object
        Sandwich sandwich = new Sandwich(mainIngredient, breadType, price);

        // Display sandwich details
        System.out.println("\nSandwich Details:");
        System.out.println(sandwich);

        // Close scanner
        scanner.close();
    }
}
