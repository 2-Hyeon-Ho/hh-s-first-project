public abstract class BeverageFactory {
    static IceBeverageFactory iceBeverageFactory = new IceBeverageFactory();
    static HotBeverageFactory hotBeverageFactory = new HotBeverageFactory();
    static TeaBeverageFactory teaBeverageFactory = new TeaBeverageFactory();

    //객체 생성을 서브클래스에서 정의하기 위해 추상메서드로 작성
    protected abstract BeverageMachine create(String name, int price);     
    
    public BeverageMachine createBeverage(String name, int price) {
       BeverageMachine beverage = create(name, price);
       return beverage;
    }  

    //음료 종류를 선택하면 그에 맞는 음료리스트가 메뉴에 저장되는 메서드
    public BeverageMachine[] beverageList(Beverage beverage) {       
       BeverageMachine[] menu = null;
       menu = new BeverageMachine[4];  
       switch(beverage) {
           case IceBeverage:
               for(int i = 0; i < menu.length; i++) {
                   menu[i] = iceBeverageFactory.createBeverage(i);
               }
               break;
            case HotBeverage:
               for(int i = 0; i < menu.length; i++) {
                    menu[i] = hotBeverageFactory.createBeverage(i);
               }
               break;
            case TeaBeverage:
               for(int i = 0; i < menu.length; i++) {
                    menu[i] = teaBeverageFactory.createBeverage(i);
               }
               break;
       }
       return menu;
    }

    //마실 음료를 선택하는 추상메서드
    protected abstract BeverageMachine createBeverage(int selectNum);
}
