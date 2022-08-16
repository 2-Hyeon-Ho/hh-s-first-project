import java.util.Scanner;

public class PaymentOnlinePay extends Payment {
    //온라인페이도 마찬가지로 1을 입력받으면 연결되는 식으로 구현하였습니다.
    public static boolean isCharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("온라인페이 이용(1) 아니라면 아무 숫자나 눌러주세요 : ");
        int touchPhone = scanner.nextInt();

        if(touchPhone == 1) {
            Payment.completePay();
            return true;
        }else {
            System.out.println("온라인페이 인식이 되지 않았습니다.");
            return false;
        }
    }
}
