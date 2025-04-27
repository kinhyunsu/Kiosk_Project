package Kiosk.Lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;
    private Scanner scanner;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.print("주문을 하시겠어요 ? (go)를 입력하시거나 (exit)를 입력해주세요. : ");
            String input = scanner.next();

            if (input.equals("go")) {
                System.out.println("---- SHAKESHAKE MENU ----");
                for (int i = 0; i < menuItems.size(); i++) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.println((i + 1) + ". " + menuItems.get(i));
                }
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            } else if (input.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 입력을 해주세요. (go 또는 exit)");
                continue;
            }

            System.out.print("메뉴 번호를 선택해주세요 : ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= menuItems.size()) {
                System.out.println(choice + ". " + menuItems.get(choice - 1));
            } else {
                System.out.println("1~" + menuItems.size() + "번 중 메뉴를 골라주세요.");
            }
        }
    }
}
