package Exercise_01_WorkingWithAbstractions.P03_CardsWithPower;

import Exercise_01_WorkingWithAbstractions.CardRank;
import Exercise_01_WorkingWithAbstractions.CardSuit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cardRank = reader.readLine();
        String cardSuit = reader.readLine();

        Card card = new Card(CardRank.valueOf(cardRank), CardSuit.valueOf(cardSuit));

        System.out.println(card.toString());


    }
}
