package Exercise_02_Encapsulation.P03_ShoppingSpree;

public class Validator {
    public static void validatesName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    public static void validatesMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    private Validator() {
    }
}