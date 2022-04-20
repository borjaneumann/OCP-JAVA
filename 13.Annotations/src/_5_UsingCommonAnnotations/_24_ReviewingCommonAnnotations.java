package _5_UsingCommonAnnotations;

public class _24_ReviewingCommonAnnotations {
    /*
    Understanding common annotations
    Annotation              Marker annotation   Type of value()     Optional members
    ===========================================================================
    @Override               Yes                 —                   —
    @FunctionalInterface    Yes                 —                   —
    @Deprecated             No                  —                   String since()
                                                                    boolean forRemoval()
    @SuppressWarnings       No                  String[]            —
    @SafeVarargs            Yes                 —                   —

    Some of these annotations have special rules that will trigger a compiler
    error if used incorrectly, as shown in Table 13.6.
    TABLE 13.6 Applying common annotations

    Annotation                  Applies to      Compiler error when
    ====================================================================================
    @Override                   Methods         Method signature does not match the signature of
                                                an inherited method
    -----------------------------------------------------------------------------------------------
    @FunctionalInterface        Interfaces      Interface does not contain a single abstract method
    -----------------------------------------------------------------------------------------------
    @Deprecated                 Most Java       -
                                declarations
    -----------------------------------------------------------------------------------------------
    @SuppressWarnings           Most Java       -
                                declarations
    -----------------------------------------------------------------------------------------------
    @SafeVarargs                Methods,        Method or constructor does not contain a varargs
                                constructors    parameter or is applied to a method not marked
                                                private, static, or final


     */
}
