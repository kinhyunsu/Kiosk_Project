package Kiosk.Lv4;

import org.w3c.dom.ls.LSOutput;

public class MenuItem {
    private String name;
    private int price;
    private String account;

    public MenuItem(String name, int price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
    }
}
