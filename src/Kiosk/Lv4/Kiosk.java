package Kiosk.Lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;
    private Scanner scanner = new Scanner(System.in);

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
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

    // ✅ 클래스 블록 내에 독립적으로 정의
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
                System.out.println("선택한 메뉴 : " + items.get(choice - 1));
            } else {
                System.out.println("올바른 입력을 해주세요 : ");
            }
        }
    }

    // ✅ 독립적인 getter, setter
    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}


