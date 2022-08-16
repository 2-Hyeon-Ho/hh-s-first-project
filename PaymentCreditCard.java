import java.util.Scanner;

public class PaymentCreditCard extends Payment {
    //카드 연결을 어떤식으로 구현해야 할지 감이 안와 1을 입력받으면 연결되는 식으로 구현했습니다.
    public static boolean isCharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("카드 투입(1) 아니라면 아무 숫자나 눌러주세요 : ");
        int insertCard = scanner.nextInt();

        if(insertCard == 1) {
            Payment.completePay();
            return true;
        }else {
            System.out.println("카드가 투입되지 않았습니다.");
            return false;
        }
    }
}
