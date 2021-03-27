package rucksack;

public class Rucksack {
    private int capacity;
    private InnerThing [] thingsInside;

    public Rucksack(int capacity, InnerThing[] thingsInside) {
        this.capacity = capacity;
        this.thingsInside = thingsInside;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int recFindBestSum(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (thingsInside[i].getWeight() > weight) {
            return recFindBestSum(i - 1, weight);
        } else {
            return Math.max(recFindBestSum(i - 1, weight),
                    recFindBestSum(i - 1, weight - thingsInside[i].getWeight()) + thingsInside[i].getPrice());
        }
    }

}
