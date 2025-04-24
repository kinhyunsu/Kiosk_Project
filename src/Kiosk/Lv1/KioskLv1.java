package Kiosk.Lv1;
import java.util.Scanner;


public class KioskLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("주문을 하시겠어요 ? (go)를 입력해주세요 ^^ : ");
            String input = scanner.next();
            if (input.equals("go")){
                System.out.println("1. ShackBurger   | W 6.9  | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("2. SmokeBurger   | W 8.9  | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("3. CheeseBurger  | W 6.9  | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("4. Hamburger     | W 5.4  | 비프패티를 기반으로 야채가 들어간 기본버거");
            } else if (input.equals("exit")){
                System.out.println("키오스크를 종료합니다.");
                break;
            } else {
                System.out.println("처음으로 돌아갑니다.");
                continue;
            }

            System.out.print("메뉴를 선택해주세요. : ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. ShackBurger   | W 6.9  | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;

                case 2:
                    System.out.println("2. SmokeBurger   | W 8.9  | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;

                case 3:
                    System.out.println("3. CheeseBurger  | W 6.9  | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;

                case 4:
                    System.out.println("4. Hamburger     | W 5.4  | 비프패티를 기반으로 야채가 들어간 기본버거");
                    break;

                default:
                    System.out.println("1~4번 중 메뉴를 선택해주세요.");
                    continue;
            }


        }


    }
}
