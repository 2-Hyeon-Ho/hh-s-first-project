public class IceBeverageFactory extends BeverageFactory {
    @Override
    protected BeverageMachine create(String name, int price) {
        BeverageMachine beverage = new IceBeverage(name, price);
        return beverage;
    }

    @Override
    protected BeverageMachine createBeverage(int selectNum) {
        switch(selectNum) {
            case 0:
                return new IceBeverage("IceAmericano", 1700);
            case 1:
                return new IceBeverage("IceChocolate", 1500);
            case 2:
                return new IceBeverage("IceCafeLatte", 2000);
            case 3:
                return new IceBeverage("PeachIceTea", 1300);
            default:
                return null;
        }
    }
}
