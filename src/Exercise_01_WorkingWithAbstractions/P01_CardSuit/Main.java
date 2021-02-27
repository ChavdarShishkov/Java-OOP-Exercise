package Exercise_01_WorkingWithAbstractions.P01_CardSuit;

import Exercise_01_WorkingWithAbstractions.CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardSuit[] values = CardSuit.values();
        System.out.println("Card Suits:");
        Arrays.stream(values).forEach(a -> System.out.printf("Ordinal value: %d; Name value: %s%n", a.ordinal(),
                a.name()));
    }
}
