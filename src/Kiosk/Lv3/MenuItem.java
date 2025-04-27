package Kiosk.Lv3;

public class MenuItem {
    private String name;
    private Double price;
    private String account;

    public MenuItem(String name, Double price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return name + " | W " + price + " | 설명 " + account;
    }
}
