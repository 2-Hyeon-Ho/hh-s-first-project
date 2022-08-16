class TeaBeverage extends BeverageMachine {
    public TeaBeverage(String name, int price) {
        super(name, price);
    }

    public static void hotCup() {
        System.out.println("종이컵을 받아주세요.");
    }

    public static void teaBag() {
        System.out.println(Test.getSelsectMenuName() + "티백을 받아주세요.");
    }
}
