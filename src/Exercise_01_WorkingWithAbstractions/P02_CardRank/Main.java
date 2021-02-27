package Exercise_01_WorkingWithAbstractions.P02_CardRank;

import Exercise_01_WorkingWithAbstractions.CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardRank[] cardRanks = CardRank.values();
        System.out.println("Card Ranks:");
        Arrays.stream(cardRanks).forEach(a -> System.out.printf("Ordinal value: %d; Name value: %s%n", a.ordinal(),
                a.name()));
    }
}
