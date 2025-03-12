public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    // Default Constructor
    public Sandwich() {
        this.mainIngredient = "Unknown";
        this.breadType = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        setPrice(price); // Using setter to ensure validation
    }

    // Getter and Setter for mainIngredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Getter and Setter for breadType
    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    // Overriding toString() method for better output representation
    @Override
    public String toString() {
        return "Sandwich{" +
                "mainIngredient='" + mainIngredient + '\'' +
                ", breadType='" + breadType + '\'' +
                ", price=" + price +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich("Chicken", "Whole Wheat", 5.99);
        System.out.println(sandwich1);

        Sandwich sandwich2 = new Sandwich();
        sandwich2.setMainIngredient("Turkey");
        sandwich2.setBreadType("White Bread");
        sandwich2.setPrice(4.99);
        System.out.println(sandwich2);
    }
}
