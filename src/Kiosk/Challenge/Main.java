package Kiosk.Challenge;

import Kiosk.Challenge.Menu;
import Kiosk.Challenge.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Menu> menus = new ArrayList<>();
        List<MenuItem> burgerItems = new ArrayList<>();

        MenuItem burger1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem burger2 = new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem burger3 = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem burger4 = new MenuItem("Hamberger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // 리스트에 추가
        burgerItems.add(burger1);
        burgerItems.add(burger2);
        burgerItems.add(burger3);
        burgerItems.add(burger4);

        // 메뉴 이름만 등록하고 메뉴 아이템은 비워둠
        menus.add(new Menu("Burgers",burgerItems));
        menus.add(new Menu("Drinks", new ArrayList<>()));
        menus.add(new Menu("Desserts", new ArrayList<>()));

        Cart cart = new Cart();
        Kiosk kiosk = new Kiosk(menus, cart);
        kiosk.start();




    }


}
