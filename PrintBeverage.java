public class PrintBeverage {
    //음료타입을 매개변수로 받아 메뉴 리스트를 출력하는 메서드
    public static void printBeverage(BeverageMachine[] beverageType) {
        for(int i = 0; i < beverageType.length; i++) {
            if(beverageType[i] != null) {
                System.out.println(i + 1 + "." + beverageType[i].getName() +"\t" + "가격 : " + beverageType[i].getPrice());
            }
        }
    }
}
