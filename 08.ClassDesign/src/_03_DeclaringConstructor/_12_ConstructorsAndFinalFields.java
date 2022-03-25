package _03_DeclaringConstructor;

public class _12_ConstructorsAndFinalFields {
    /*
    Final static variables must be assigned a value exactly once. This happens in the line of the
    declaration and in a static initializer.
    Instance variables marked final follow similar rules.
    They can be assigned values in the line in which they
    are declared or in an instance initializer.
    public class MouseHouse {
        private final int volume;
        private final String name = "The Mouse House";
        {
            volume = 10;
        }
    }
    Final fields can also be assigned in constructors
    =================================================
    The constructor is part of the initialization process, so it is
    allowed to assign final instance variables in it. For the exam, you need to
    know one important rule. By the time the constructor completes, all final
    instance variables must be assigned a value. Let’s try this out in an
    example:
    public class MouseHouse {
        private final int volume;
        private final String type;
        public MouseHouse() {
            this.volume = 10;
            type = "happy";
        }
    }
    Unlike local final variables, which are not required to have a value unless
    they are actually used, final instance variables must be assigned a value.

    public class MouseHouse {
        private final int volume;
        private final String type;
        {
            this.volume = 10;
        }
        public MouseHouse(String type) {
            this.type = type;
        }
        public MouseHouse() { // DOES NOT COMPILE
            this.volume = 2; // DOES NOT COMPILE
        }
    }
    The second constructor does not compile for two reasons. First, the
    constructor fails to set a value for the type variable. The compiler detects
    that a value is never set for type and reports an error on the line where the
    constructor is declared. Second, the constructor sets a value for the volume
    variable, even though it was already assigned a value by the instance
    initializer. The compiler reports this error on the line where volume is set.

    On the exam, be wary of any instance variables marked final.
    Make sure they are assigned a value in the line where they are
    declared, in an instance initializer, or in a constructor.

    public MouseHouse() {
        this(null);
    }

    We can assign a null value to final instance variables, so long as they are explicitly set.
     */


}
