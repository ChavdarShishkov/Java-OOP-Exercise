package Exercise_01_WorkingWithAbstractions.P06_GreedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeItems = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < safeItems.length; i += 2) {
            String item = safeItems[i];
            long itemQuantity = Long.parseLong(safeItems[i + 1]);

            if (item.length() == 3) {
                bag.addCash(item, itemQuantity);
            } else if (item.toLowerCase().endsWith("gem")) {
                bag.addGems(item, itemQuantity);
            } else if (item.equalsIgnoreCase("gold")) {
                bag.addGold(itemQuantity);
            }
        }
        bag.printContent();
    }
}