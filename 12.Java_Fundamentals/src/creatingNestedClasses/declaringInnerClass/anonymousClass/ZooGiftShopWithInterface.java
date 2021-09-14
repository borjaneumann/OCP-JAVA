package creatingNestedClasses.declaringInnerClass.anonymousClass;

//In this example, writing an anonymous
//class is equivalent to writing a local class with an unspecified name that
//extends SaleTodayOnly and then immediately using it.

public class ZooGiftShopWithInterface {
    interface SaleTodayOnly {
         int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { //lines 8-11 define the anonymous class
           public int dollarsOff() { return 3; }; //interfaces require public methods
        }; //we are declaring a local variable thus the semicolon.
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        ZooGiftShopWithInterface shop = new ZooGiftShopWithInterface();
        System.out.println(shop.admission(8));
    }
}
