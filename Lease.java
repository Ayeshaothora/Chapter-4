// Lease.java

public class Lease {
    // Fields
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTermMonths;

    // Default constructor
    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        monthlyRent = 1000.0;
        leaseTermMonths = 12;
    }

    // Getters
    public String getTenantName() {
        return tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public int getLeaseTermMonths() {
        return leaseTermMonths;
    }

    // Setters
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setLeaseTermMonths(int leaseTermMonths) {
        this.leaseTermMonths = leaseTermMonths;
    }

    // Non-static method to add pet fee
    public void addPetFee() {
        monthlyRent += 10;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 has been added to the monthly rent.");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Lease object
        Lease lease1 = new Lease();

        // Display default values
        System.out.println("Default Lease Information:");
        System.out.println("Tenant Name: " + lease1.getTenantName());
        System.out.println("Apartment Number: " + lease1.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease1.getMonthlyRent());
        System.out.println("Lease Term (months): " + lease1.getLeaseTermMonths());

        System.out.println("\nUpdating lease information...");

        // Update values
        lease1.setTenantName("John Doe");
        lease1.setApartmentNumber(101);
        lease1.setMonthlyRent(1200.0);
        lease1.setLeaseTermMonths(18);

        // Display updated values
        System.out.println("\nUpdated Lease Information:");
        System.out.println("Tenant Name: " + lease1.getTenantName());
        System.out.println("Apartment Number: " + lease1.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease1.getMonthlyRent());
        System.out.println("Lease Term (months): " + lease1.getLeaseTermMonths());

        // Add pet fee
        System.out.println("\nAdding pet fee...");
        lease1.addPetFee();

        // Display final rent after pet fee
        System.out.println("\nFinal Monthly Rent after Pet Fee: $" + lease1.getMonthlyRent());
    }
}
