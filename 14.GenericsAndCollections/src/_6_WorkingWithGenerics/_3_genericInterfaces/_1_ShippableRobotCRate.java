package _6_WorkingWithGenerics._5_genericInterfaces;

import _6_WorkingWithGenerics._2_GenericClasses.Robot;

public class _1_ShippableRobotCRate implements _1_Shippable<Robot> {
    public void ship(Robot t) {}
}
