package Kiosk.Challenge;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menus;
    private Cart cart;
    private Scanner scanner = new Scanner(System.in);

    public Kiosk(List<Menu> menus, Cart cart) {
        this.menus = menus;
        this.cart = cart;
    }

    public void start() {
        while (true) {
            System.out.println(" [ MAIN MENU ] ");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + "." + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료 | 종료");

            System.out.print("메뉴를 선택하세요 : ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input >= 1 && input <= menus.size()) {
                showMenuItems(menus.get(input - 1));
            } else {
                System.out.println("올바른 입력을 해주세요.");
            }
        }
    }

    // 클래스 블록 내에 독립적으로 정의
    private void showMenuItems(Menu menu) {
        while (true) {
            System.out.println("[ " + menu.getCategoryName() + " MENU ]");

            List<MenuItem> items = menu.getMenuItems();
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
            System.out.println("0. 뒤로가기");

            System.out.println("메뉴 번호를 선택해주세요 : ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                return;
            }

            if (choice >= 1 && choice <= items.size()) {
                MenuItem selectedItem = items.get(choice -1);
                System.out.println("선택한 메뉴 : " + items.get(choice - 1));
                System.out.println(selectedItem.getName() + " 을(를) 장바구니에 추가하시겠습니까?");
                System.out.println(" 1. 확인            |            2. 취소");

                int action = scanner.nextInt();
                if (action == 1) {
                    cart.addItem(selectedItem, 1);
                    System.out.println(selectedItem.getName() + " 이(가) 장바구니에 추가되었습니다.");
                    showOrderMenu();
                } else {
                    System.out.println("취소되었습니다.");
                }

            } else {
                System.out.println("올바른 입력을 해주세요 : ");
            }
        }
    }

    private void showOrderMenu() {
        if (!cart.isEmpty()) {
            System.out.println("\n [ ORDER MENU ]");
            System.out.println("4. Orders | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel | 진행중인 주문을 취소합니다.");

            System.out.println("메뉴를 선택하세요 : ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                showOrderDetails();
            } else if ( choice == 5) {
                cart.clear(); // 장바구니 초기화
                System.out.println("주문이 취소되었습니다.");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void showOrderDetails() {
        System.out.println("\n[ Orders ]");
        cart.showCart();

        System.out.println("\n [ Total ] ");
        System.out.println("W " + cart.getTotalAmount());

        System.out.println("1. 주문      |      2. 메뉴판 ");
        System.out.println(" 선택 :");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("주문이 완료 되었습니다. 금액은 W" + cart.getTotalAmount() +  " 입니다.");
            cart.clear();
        } else {
            System.out.println("메뉴판으로 돌아갑니다.");
        }
    }

    // 독립적인 getter, setter
    public List<Menu> getMenus() { return menus; }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

}
