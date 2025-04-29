package Kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();

        // 메뉴 이름만 등록하고 메뉴 아이템은 비워둠
        menus.add(new Menu("Burgers", new ArrayList<>()));
        menus.add(new Menu("Drinks", new ArrayList<>()));
        menus.add(new Menu("Desserts", new ArrayList<>()));

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

    }
}
