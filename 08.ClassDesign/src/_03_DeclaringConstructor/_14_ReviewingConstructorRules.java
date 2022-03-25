package _03_DeclaringConstructor;

public class _14_ReviewingConstructorRules {
    /*
    Let’s review some of the most important constructor rules that we covered in this part of the chapter.

    1. The first statement of every constructor is a call to an overloaded
    constructor via this(), or a direct parent constructor via super().
    2. If the first statement of a constructor is not a call to this() or super(),
    then the compiler will insert a no-argument super() as the first statement
    of the constructor.
    3. Calling this() and super() after the first statement of a constructor
    results in a compiler error.
    4. If the parent class doesn’t have a no-argument constructor, then every
    constructor in the child class must start with an explicit this() or super()
    constructor call.
    5. If the parent class doesn’t have a no-argument constructor and the child
    doesn’t define any constructors, then the child class will not compile.
    6. If a class only defines private constructors, then it cannot be extended by
    a top-level class.
    7. All final instance variables must be assigned a value exactly once by the
    end of the constructor. Any final instance variables not assigned a value
    will be reported as a compiler error on the line the constructor is declared.
    Make sure you understand these rules. The exam will often provide code
    that breaks one or many of these rules and therefore doesn’t compile.

    Tip:
    When taking the exam, pay close attention to any question involving
    two or more classes related by inheritance. Before even attempting
    to answer the question, you should check that the constructors are
    properly defined using the previous set of rules. You should also
    verify the classes include valid access modifiers for members. Once
    those are verified, you can continue answering the question.
     */
}
