package creatingNestedClasses.declaringInnerClass.anonymousClass;

//In this example, writing an anonymous
//class is equivalent to writing a local class with an unspecified name that
//extends SaleTodayOnly and then immediately using it.

public class ZooGiftShopArgument {
    interface SaleTodayOnly {
         int dollarsOff();
    }
    public int pay() {
        return admission (5, new SaleTodayOnly() {
            public int dollarsOff() {return 3; }
        });
    }
    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
    //You can even define anonymous classes outside a method body. The
    //following may look like we are instantiating an interface as an instance
    //variable, but the {} after the interface name indicates that this is an
    //anonymous inner class implementing the interface.
    interface Climb {}
    Climb climbing = new Climb() {};

    public static void main(String[] args) {
        ZooGiftShopArgument shop = new ZooGiftShopArgument();
        System.out.println(shop.pay());
    }
}
