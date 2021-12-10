package _5_genericInterfaces;

import _4_WorkingWithGenerics._2_GenericClasses.Robot;

public class ShippableRobotCRate implements Shippable <Robot> {
    public void ship(Robot t) {}
}
