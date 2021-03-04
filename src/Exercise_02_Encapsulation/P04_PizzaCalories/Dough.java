package Exercise_02_Encapsulation.P04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholewheat")) {
            throw new IllegalArgumentException("invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!flourType.equals("Crispy") && !flourType.equals("Chewy") && !flourType.equals("Homemade")) {
            throw new IllegalArgumentException("invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough should be in range [1..200]");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * this.getModifiesByBakingTechnique(this.bakingTechnique) * this.getModifiesByFlourType(this.flourType);
    }

    private double getModifiesByBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            case "Homemade":
                return 1.0;
        }
        return 0.0;
    }

    private double getModifiesByFlourType(String flourType) {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;
        }
        return 0.0;
    }
}
