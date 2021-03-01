package Exercise_01_WorkingWithAbstractions.P06_GreedyTimes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final long capacity;
    private final Map<String, Long> gems;
    private final Map<String, Long> cash;
    private long totalItemQuantity;
    private long gold;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.gems = new HashMap<>();
        this.cash = new HashMap<>();
    }

    public void addCash(String item, long itemQuantity) {
        long totalGems = totalGems();
        long totalCash = totalCash();

        if (hasFreeCapacity(itemQuantity) && totalGems >= totalCash + itemQuantity) {

            if (!this.cash.containsKey(item)) {
                this.cash.put(item, itemQuantity);
            } else {
                this.cash.put(item, this.cash.get(item) + itemQuantity);
            }
            this.totalItemQuantity += itemQuantity;
        }
    }

    public void addGems(String item, long itemQuantity) {
        long totalGems = totalGems();

        if (hasFreeCapacity(itemQuantity) && totalGems + itemQuantity <= this.gold) {

            if (!this.gems.containsKey(item)) {
                this.gems.put(item, itemQuantity);
            } else {
                this.gems.put(item, this.gems.get(item) + itemQuantity);
            }
            this.totalItemQuantity += itemQuantity;
        }
    }

    public void addGold(long itemQuantity) {

        if (hasFreeCapacity(itemQuantity)) {
            this.gold += itemQuantity;
            this.totalItemQuantity += itemQuantity;
        }
    }

    private boolean hasFreeCapacity(long itemQuantity) {
        return itemQuantity + totalItemQuantity <= capacity;
    }

    private long totalCash() {
        return this.cash.values().stream().mapToLong(e -> e).sum();
    }

    private long totalGems() {
        return this.gems.values().stream().mapToLong(e -> e).sum();
    }

    private Comparator<Map.Entry<String, Long>> getComparator() {
        return (e1, e2) -> {
            int res = e2.getKey().compareTo(e1.getKey());

            if (res == 0) {
                res = e1.getValue().compareTo(e2.getValue());
            }
            return res;
        };
    }

    public void printContent() {
        StringBuilder sb = new StringBuilder();

        if (this.gold > 0) {
            sb.append(String.format("<Gold> $%d", this.gold)).append(System.lineSeparator());
            sb.append(String.format("##Gold - %d", this.gold)).append(System.lineSeparator());
        }

        if (!this.gems.isEmpty()) {
            sb.append(String.format("<Gems> $%d", totalGems())).append(System.lineSeparator());

            this.gems.entrySet().stream().sorted(getComparator()).forEach(entry -> sb.append(String.format("##%s - " + "%d", entry.getKey(), entry.getValue())).append(System.lineSeparator()));
        }

        if (!this.cash.isEmpty()) {
            sb.append(String.format("<Gems> $%d", totalCash())).append(System.lineSeparator());

            this.cash.entrySet().stream().sorted(getComparator()).forEach(entry -> sb.append(String.format("##%s - " + "%d", entry.getKey(), entry.getValue())).append(System.lineSeparator()));
        }

        System.out.print(sb.toString());
    }
}
