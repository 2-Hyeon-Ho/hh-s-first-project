public class IceBeverage extends BeverageMachine {
    public IceBeverage(String name, int price) {
        super(name, price);
    }

    public static void iceCup() {
        System.out.println("플라스틱컵을 받아주세요.");
    }

    public static void iceExtraction() {
        System.out.println("얼음추출대에서 얼음을 받아주세요");
    }
}