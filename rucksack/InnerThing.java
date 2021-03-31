package rucksack;

public class InnerThing{

    private int weight;
    private int price;
    private String name;

    public InnerThing(int weight, int price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public InnerThing(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }


}
