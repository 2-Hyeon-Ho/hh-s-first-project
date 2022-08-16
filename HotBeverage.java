public class HotBeverage extends BeverageMachine {
    public HotBeverage(String name, int price) {
        super(name, price);
    }

    public static void hotCup() {
        System.out.println("종이컵을 받아주세요.");
    }
}
