package _03_CreatingNestedClasses.declaringInnerClass._4_AnonymousClass;

//In this example, writing an anonymous
//class is equivalent to writing a local class with an unspecified name that
//extends SaleTodayOnly and then immediately using it.

public class ZooGiftShopWithAbstractClass {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { //lines 8-11 define the anonymous class
            @Override
            int dollarsOff() { return 3; };
        }; //we are declaring a local variable thus the semicolon.
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        ZooGiftShopWithAbstractClass shop = new ZooGiftShopWithAbstractClass();
        System.out.println(shop.admission(8));
    }
}
