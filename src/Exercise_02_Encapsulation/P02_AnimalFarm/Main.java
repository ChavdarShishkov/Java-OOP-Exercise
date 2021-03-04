package Exercise_02_Encapsulation.P02_AnimalFarm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Chicken chicken = new Chicken(name, age);

        System.out.println(chicken.toString());
    }
}
