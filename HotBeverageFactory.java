public class HotBeverageFactory extends BeverageFactory {
    @Override
    protected BeverageMachine create(String name, int price) {
        BeverageMachine beverage = new HotBeverage(name, price);
        return  beverage;
    }

    @Override
    protected BeverageMachine createBeverage(int selectNum) {
        switch(selectNum) {
            case 0:
                return new HotBeverage("HotAmericano", 1500);
            case 1:
                return new HotBeverage("HotCafeLatte", 1700);
            case 2:
                return new HotBeverage("HotMochachino", 2000);
            case 3:
                return new HotBeverage("HotChocolate", 1300);
            default:
                return null;
        }
    }
}
