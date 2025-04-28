package Kiosk.Lv4;

import org.w3c.dom.ls.LSOutput;

public class MenuItem {
    private String name;
    private double price;
    private String account;

    public MenuItem(String name, double price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getAccount() { return account;}

    @Override
    public String toString() {
        return name + " | W " + price + " | 설명 :  " + account;
    }
}
