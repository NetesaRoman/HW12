package coffee.order;

public class Order {
    private String name;
    private int number;

    public Order(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void showInfo() {
        System.out.println(name + " | " + number);
    }

    public int getNumber() {
        return number;
    }
}
