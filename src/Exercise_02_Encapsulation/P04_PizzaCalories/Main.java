package Exercise_02_Encapsulation.P04_PizzaCalories;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaTokens = reader.readLine().split("\\s+");
        String[] doughTokens = reader.readLine().split("\\s+");
        int countOfToppings = Integer.parseInt(pizzaTokens[2]);

        Pizza pizza = new Pizza(pizzaTokens[1], countOfToppings);
        Dough dough = new Dough(doughTokens[1], doughTokens[2], Double.parseDouble(doughTokens[3]));
        String input = reader.readLine();

        for (int i = 0; i < countOfToppings; i++) {
            String[] toppingTokens = reader.readLine().split("\\s+");
            Topping topping = new Topping(toppingTokens[1], Double.parseDouble(toppingTokens[2]));

            pizza.addTopping(topping);
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
