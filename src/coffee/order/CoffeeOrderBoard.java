package coffee.order;

import java.util.ArrayList;

public class CoffeeOrderBoard {
    private ArrayList<Order> orders;
    private int number = 0;


    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }

    public boolean add(String orderName) {
        if (isNull(orderName)) {
            return false;
        }

        Order newOrder = new Order(orderName, number);
        orders.add(newOrder);
        number++;

        return true;
    }

    public Order deliver() {
        Order order = orders.get(0);
        orders.remove(order);
        return order;
    }

    public Order deliver(int number) throws NullPointerException {
        Order order = findByNum(number);
        if (isNull(order)) {
            throw new NullPointerException("Такого заказа нет! Исключение выброшено. ");
        }
        orders.remove(order);
        return order;
    }

    public void showBoard() {
        System.out.println("--------------");
        System.out.println("Имя  |  номер");
        System.out.println("--------------");
        for (Order order : orders) {
            order.showInfo();
        }
    }

    private <T> boolean isNull(T obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    private Order findByNum(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                return order;
            }
        }
        return null;
    }

}
