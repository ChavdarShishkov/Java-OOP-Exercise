package Exercise_02_Encapsulation.P03_ShoppingSpree;


public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        Validator.validatesName(name);
        this.name = name;
    }

    private void setCost(double cost) {
        Validator.validatesMoney(cost);
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
