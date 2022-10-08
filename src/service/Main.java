package service;

import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard cob = new CoffeeOrderBoard();

        cob.add("Roma");
        cob.add("Valera");
        cob.add("Kirill");
        cob.add("Vlad");
        cob.add("Ilya");
        cob.add("Misha");
        cob.add("Veronika");
        cob.add("Erwin");
        cob.add("Katya");

        cob.showBoard();

        System.out.println("Доставлен самый первый заказ ");
        cob.deliver().showInfo();
        System.out.println("Доставлен четвёртый заказ ");
        cob.deliver(4).showInfo();
        System.out.println("Попытка повторно доставить четвёртый заказ ");
        try {
            cob.deliver(4).showInfo();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            cob.showBoard();
        }


    }
}