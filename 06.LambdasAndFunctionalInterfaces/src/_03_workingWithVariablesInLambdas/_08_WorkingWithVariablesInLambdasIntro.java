package _03_workingWithVariablesInLambdas;

public class _08_WorkingWithVariablesInLambdasIntro {
    /*
    Variables can appear in three places with respect to lambdas:

        1) The parameter list,
        2) local variables declared inside the lambda body
        3) Variables referenced from the lambda body.

    All three of these are opportunities for the exam to trick you.

    Rules for accessing a variable from a lambda body inside a method
    Variable type                   Rule
    ==========================================================
    Instance variable               Allowed
    Static variable                 Allowed
    Local variable                  Allowed if effectively final
    Method parameter                Allowed if effectively final
    Lambda parameter                Allowed

    */
}
