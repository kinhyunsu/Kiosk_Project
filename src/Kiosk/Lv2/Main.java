package Kiosk.Lv2;

import Kiosk.Menu;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
        MenuItem item2 = new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem item3 = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem item4 = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuList = new ArrayList<>();
        menuList.add(item1);
        menuList.add(item2);
        menuList.add(item3);
        menuList.add(item4);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("주문을 하시겠어요 ? (go)를 입력하시거나 (exit)를 입력해주세요. : ");
            String input = scanner.next();

            if (input.equals("go")){
                System.out.println("---- SHAKESHAKE MENU ----");

                for (int i = 0; i < menuList.size(); i++) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.println((i + 1) + "." + menuList.get(i).getName() + " | W " + menuList.get(i).getPrice() + " 상세내용 : " + menuList.get(i).getAccount());
                }
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");

            } else if (input.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            System.out.print("메뉴 번호를 선택해주세요 : ");
            int choice = scanner.nextInt();

            switch(choice)
            {

                case 1:
                    System.out.println("1." + item1);
                    break;

                    case 2:
                    System.out.println("2." + item2);
                    break;

                    case 3:
                    System.out.println("3." + item3);
                    break;

                    case 4:
                    System.out.println("4." + item4);
                    break;

                    default:
                    System.out.println("1~4번 중 메뉴를 골라주세요.");
                    continue;
            }


        }


    }


}

