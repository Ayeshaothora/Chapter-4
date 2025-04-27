import java.util.Scanner;

class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm; // in months
    private static final double PET_FEE = 10.0;

    // Default constructor
    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        monthlyRent = 1000.0;
        leaseTerm = 12;
    }

    // Constructor with parameters
    public Lease(String tenantName, int apartmentNumber, double monthlyRent, int leaseTerm) {
        this.tenantName = tenantName;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRent = monthlyRent;
        this.leaseTerm = leaseTerm;
    }

    // Method to add pet fee
    public void addPetFee() {
        monthlyRent += PET_FEE;
        System.out.println("A pet fee of $" + PET_FEE + " has been added to the monthly rent.");
    }

    // Method to display lease values
    public void showValues() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Monthly Rent: $" + monthlyRent);
        System.out.println("Lease Term: " + leaseTerm + " months");
        System.out.println("------------------------------");
    }
}

public class TestLease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare four Lease objects
        Lease lease1, lease2, lease3, lease4;

        // Get data for the first three leases
        lease1 = getData(input);
        lease2 = getData(input);
        lease3 = getData(input);

        // Fourth lease holds default values
        lease4 = new Lease();

        // Show values for lease1
        System.out.println("Showing values for lease1:");
        lease1.showValues();

        // Add pet fee to lease1
        lease1.addPetFee();

        // Show values again for lease1
        System.out.println("Showing values for lease1 after adding pet fee:");
        lease1.showValues();

        // Show values for lease2, lease3, lease4
        System.out.println("Showing values for lease2:");
        lease2.showValues();

        System.out.println("Showing values for lease3:");
        lease3.showValues();

        System.out.println("Showing values for lease4:");
        lease4.showValues();
    }

    // Method to get lease data from user
    public static Lease getData(Scanner input) {
        System.out.print("Enter tenant's name: ");
        String name = input.nextLine();

        System.out.print("Enter apartment number: ");
        int aptNum = input.nextInt();

        System.out.print("Enter monthly rent: ");
        double rent = input.nextDouble();

        System.out.print("Enter lease term in months: ");
        int term = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        return new Lease(name, aptNum, rent, term);
    }
}

