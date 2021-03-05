package Exercise_03_Inheritance.P01_Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Person person = new Person(name, age);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
