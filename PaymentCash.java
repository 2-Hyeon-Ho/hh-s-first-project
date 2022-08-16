import java.util.Scanner;

public class PaymentCash extends Payment {
    //현금으로 결제할 경우 금액을 입력받고 선택한 메뉴의 가격보다
    //클 경우 잔돈을 주고 작을 경우 false를 반환하는 메서드
    //Greedy Method를 활용한 동전반환은 다시 작성해볼 예정입니다..
    public static boolean isCharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("투입할 금액을 입력해주세요 : ");
        int money = scanner.nextInt();

        if(money >= Test.getSelectMenuPrice()) {
            Payment.completePay();
            System.out.println("잔돈 : " + (money - Test.getSelectMenuPrice()) + "원을 받아주세요.");
            return true;
        } else {
            System.out.println("금액이 부족합니다.");
            return false;
        }
    }
}
