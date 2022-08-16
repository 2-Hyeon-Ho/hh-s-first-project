import java.util.Scanner;

public class Payment {
    Scanner scanner = new Scanner(System.in);
    //결제방식을 입력받아 결제가 가능한지 체크하는 메서드
    public boolean paymentMethod() {
        System.out.println("결제 방식을 선택해주세요");
        System.out.print("현금(1), 신용카드(2), 온라인페이(3) : ");
        
        int payMethodNum = scanner.nextInt();

        if(payMethodNum == 1) {
            return PaymentCash.isCharge();
        }else if(payMethodNum == 2) {
            return PaymentCreditCard.isCharge();
        }else if(payMethodNum == 3) {
            return PaymentOnlinePay.isCharge();
        }else {
            System.out.println("잘못된 결제방식입니다.");
            return false;
        }
    }

    public static void completePay() {
        System.out.println("결제완료 되었습니다.");
        System.out.println("------------------------------------------");
    }
}
