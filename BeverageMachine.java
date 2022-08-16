public abstract class BeverageMachine {
    protected String name;
    protected int price;

    public static void beverageExtraction() {
        System.out.println(Test.getSelsectMenuName() + "을(를) 받아주세요.");
        System.out.println("감사합니다 안녕히가세요.");
    }

    public BeverageMachine(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}