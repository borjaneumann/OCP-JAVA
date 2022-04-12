package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod;

public class _15_UnderstandingInterfaceMembersIntro {
    /*
    When Java was first released, there were only two types of members an
    interface declaration could include: abstract methods and constant (
    static final) variables. Since Java 8 and 9 were released, four new
    method types have been added that we will cover in this section.

    Interface member types
                        Since           Members         Required        Implicit        Has value
                        Java            hip type        modifiers       modifiers       or body?
                        version
    ==============================================================================================
    Constant            1.0             Class               —           public          Yes
    variable                                                            static
                                                                        final
    ----------------------------------------------------------------------------------------------
    Abstract            1.0             Instance            —           public          No
    method                                                              abstract
    ----------------------------------------------------------------------------------------------
    Default             8               Instance        default         public          Yes
    method
    ----------------------------------------------------------------------------------------------
    Static              8               Class           static          public          Yes
    method
    ----------------------------------------------------------------------------------------------
    Private             9               Instance        private         —               Yes
    method
    ----------------------------------------------------------------------------------------------
    Private             9               Class           private         -               Yes
    static                                              static
    method
    ----------------------------------------------------------------------------------------------
     */
}
