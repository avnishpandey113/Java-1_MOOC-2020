
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        int suitcaseWeight = 0;
        for (Item i : items) {
            suitcaseWeight += i.getWeight();
        }
        if ((this.maximumWeight - suitcaseWeight) >= item.getWeight()) {
            this.items.add(item);
        }

    }

    @Override
    public String toString() {
        int suitcaseWeight = 0;
        for (Item item : items) {
            suitcaseWeight += item.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (" + suitcaseWeight + " kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + suitcaseWeight + " kg)";
        }
        return this.items.size() + " items (" + suitcaseWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }

}
