package _6_SupportingInternationalizationAndLocalization;

public class _19_LocalizingNumbers {
    //The java.text package includes the needed classes.
    // The following sections cover how to format numbers, currency, and dates based on the locale.

    //The first step to formatting or parsing data is the same:
    // obtain an instance of a NumberFormat (factory methods).

    /*Description                               Using default Locale and a specified Locale
    ---------------------------------------------------------------------------------------
    A general‐purpose formatter                 NumberFormat.getInstance()
                                                NumberFormat.getInstance(locale)
    ---------------------------------------------------------------------------------------
    Same as getInstance                         NumberFormat.getNumberInstance()
                                                NumberFormat.getNumberInstance(locale)
    ---------------------------------------------------------------------------------------
    For formatting monetary amounts             NumberFormat.getCurrencyInstance()
                                                NumberFormat.getCurrencyInstance(locale)
    ---------------------------------------------------------------------------------------
    For formatting percentages                  NumberFormat.getPercentInstance()
                                                NumberFormat.getPercentInstance(locale)
    ---------------------------------------------------------------------------------------
    Rounds decimal values before displaying     NumberFormat.getIntegerInstance()
                                                NumberFormat.getIntegerInstance(locale)
     */
    /*Once you have the NumberFormat instance, you can call format() to turn a
    number into a String, or you can use parse() to turn a String into a
    number.
    The format classes are not thread‐safe. Do not store them in instance
    variables or static variables*/

}
