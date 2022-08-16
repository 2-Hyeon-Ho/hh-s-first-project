public class TeaBeverageFactory extends BeverageFactory {
    @Override
    protected BeverageMachine create(String name, int price) {
        BeverageMachine beverage = new TeaBeverage(name, price);
        return beverage;
    }

    @Override
    protected BeverageMachine createBeverage(int selectNum) {
        switch(selectNum) {
            case 0:
                return new TeaBeverage("GreenTea", 1500);
            case 1:
                return new TeaBeverage("BlackTea", 1800);
            case 2:
                return new TeaBeverage("BarleyTea", 1300);
            case 3:
                return new TeaBeverage("ChamomileTea", 2000);
            default:
                return null;
        }
    }
}
