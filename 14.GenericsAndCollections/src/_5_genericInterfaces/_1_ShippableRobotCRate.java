package _5_genericInterfaces;

import _4_WorkingWithGenerics._2_GenericClasses.Robot;

public class _1_ShippableRobotCRate implements _1_Shippable<Robot> {
    public void ship(Robot t) {}
}
