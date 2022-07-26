/*
тут написана вся логика для интернет магазина
 */
package com.company.market;

public class InternetMarket {

    public static void main(String[] args) {

        Client client1 = new Client();
        client1.name = "Vova";
        client1.money = 5000;

        Item item1 = new Item();
        item1.available = true;
        item1.price = 3400;

        if (item1.available = true) {
            if (client1.money > item1.price) {
                System.out.println("congratulations");
            } else {
                System.out.println("sorry u need " + (item1.price - client1.money));
            }
        } else {
            System.out.println("no stock");
        }
    }
}
