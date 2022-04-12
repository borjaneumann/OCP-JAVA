package _03_CreatingNestedClasses;

public class _14_ReviewingNestedClasses {
/*
Modifiers in nested classes
Permitted Modifiers     Inner class     static nested class     Local class     Anonymous class
===============================================================================================
Access modifiers        All             All                     None            None
abstract                Yes             Yes                     Yes             No
Final                   Yes             Yes                     Yes             No

Members in nested classes
Permitted Members       Inner class     static nested class     Local class     Anonymous class
===============================================================================================
Instance methods        Yes             Yes                     Yes             Yes
Instance variables      Yes             Yes                     Yes             Yes
static methods          No              Yes                     No              No
static variables        Yes(if final)   Yes                     Yes(if final)   Yes (if final)

You should also know the information in Table 12.3 about types of access.
For example, the exam might try to trick you by having a static class
access an outer class instance variable without a reference to the outer
class.

Nested class access rules
                        Inner class     static nested class     Local class     Anonymous class
===============================================================================================
Can extend any class                                                            No—must have
or implement any        Yes             Yes                     Yes             exactly one
number of interfaces                                                            superclass or one
                                                                                interface
-----------------------------------------------------------------------------------------------
Can access instance
members of enclosing    Yes             No                      Yes (if         Yes (if
class without a                                                 declared in an  declared in an
reference                                                       instance method)instance method)
------------------------------------------------------------------------------------------------
Can access local                                                Yes (if         Yes (if
variables of            N/A             N/A                     final or        final or
enclosing method                                                effectively     effectively
                                                                final)          final)
------------------------------------------------------------------------------------------------
*/


}
