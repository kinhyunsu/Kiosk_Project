package Kiosk.Challenge;

public class MenuItem {

    private String name;
    private double price;
    private String account;

    public MenuItem(String name, double price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
    }
    //getter, setter는 필요하지 않아서 추가하지 않았음
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getAccount() { return account;}

    @Override
    public String toString() {
        return name + " | W " + price + " | 설명 :  " + account;
    }

}
