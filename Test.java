import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);

    Beverage myBeverage;
    static BeverageMachine[] menu;
    static int selectMenuNum;
    
    public static void main(String[] args) {
        Test test = new Test();
        Payment payment = new Payment();
        test.select();
        test.printMenu();
        test.selectMenu();
        payment.paymentMethod();
        test.cup();
        BeverageMachine.beverageExtraction();
    }

    //enum배열의 해당요소에 beverageList메서드를 통해 myBeverage배열 안에 저장
    private BeverageMachine[] getBeverage(int iceOrHot) {
        //BeverageFactory는 추상클래스라 인스턴스화가 안된다. 그래서 IceBeverageFactory를 인스턴스화함 정상적으로 동작함??
        BeverageFactory beverageFactory = new IceBeverageFactory();         

        BeverageMachine[] myBeverage = beverageFactory.beverageList(Beverage.values()[iceOrHot]);
        return myBeverage;
        
    }

    //ice,hot,tea를 고르는 메서드로 입력받은 값을 통해 menu배열에 메뉴리스트 저장
    public void select() {
        System.out.println("마실 음료의 종류를 골라주세요.");
        System.out.print("차가운음료(1), 따뜻한음료(2), 티백음료(3) : ");
        int iceOrHot = scanner.nextInt() -1;
        this.myBeverage = Beverage.values()[iceOrHot];
        menu = getBeverage(iceOrHot);
        System.out.println("------------------------------------------");
    }

    //menu배열 출력메서드
    public void printMenu() {
        PrintBeverage.printBeverage(this.menu);
        System.out.println("------------------------------------------");
    }

    //마실 음료를 고르는 메서드
    public void selectMenu() {
        System.out.print("주문할 음료메뉴 번호를 입력해주세요 : ");
        selectMenuNum = scanner.nextInt() -1;
        System.out.println(menu[selectMenuNum].getName() + "\t" + "가격 : " + menu[selectMenuNum].getPrice());
        System.out.println("------------------------------------------");
    }

    //선택한 음료의 가격 get메서드
    public static int getSelectMenuPrice() {
        return menu[selectMenuNum].getPrice();
    }

    //선택한 음료의 이름 get메서드
    public static String getSelsectMenuName() {
        return menu[selectMenuNum].getName();
    }

    //선택한 음료종류에 맞는 컵과 얼음등을 주기위한 메서드
    public void cup() {
        if(myBeverage == Beverage.IceBeverage) {
            IceBeverage.iceCup();
            IceBeverage.iceExtraction();
        }else if(myBeverage == Beverage.HotBeverage) {
            HotBeverage.hotCup();
        }else {
            TeaBeverage.hotCup();
            TeaBeverage.teaBag();
        }
        
    }
}


