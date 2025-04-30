package Kiosk.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartItem> items = new ArrayList<>();

    public void addItem(MenuItem item, int quantity) {
        items.add(new CartItem(item, quantity));
    }

    public void showCart() {
        double total = 0;
        for (CartItem ci : items) {
            System.out.println(ci.getItem().getName() + " x " + ci.getQuantity() + " = W " + ci.getTotalPrice());
            total += ci.getTotalPrice();
        }
        System.out.println("총 금액: W " + total);
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
