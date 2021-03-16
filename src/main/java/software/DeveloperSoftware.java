package software;

public class DeveloperSoftware extends Software {

    public DeveloperSoftware(String name, int price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        price *= 1.1;
    }
}
