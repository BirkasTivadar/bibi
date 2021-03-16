package software;

public abstract class Software {

    private String name;

    protected int price;

    protected Software(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void increasePrice();
}
