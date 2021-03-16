package software;

public class OfficeSoftware extends Software {

    public OfficeSoftware(String name, int price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        price *= 1.05;
    }
}
