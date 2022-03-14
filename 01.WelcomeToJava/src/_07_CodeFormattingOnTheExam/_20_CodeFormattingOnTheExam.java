package _07_CodeFormattingOnTheExam;

public class _20_CodeFormattingOnTheExam {
    /*
    The following are common cases where you don’t need to check the imports:
    - Code that begins with a class name
    - Code that begins with a method declaration
    - Code that begins with a code snippet that would normally be inside a class or method
    - Code that has line numbers that don’t begin with 1

    On the other hand, a question that asks you about packages, imports, or the
    correct order of elements in a class is giving you clues that the question is
    virtually guaranteed to be testing you on these topics! Also note that
    imports will be not removed to save space if the package statement is
    present. This is because imports go after the package statement.

    if main() is not present, assume  any necessary plumbing code like the main() method and class
    definition were written correctly.

    Compiles!
    6: public void getLetter(ArrayList list) {
    7: if (list.isEmpty()) { System.out.println("e");
    8: } else { System.out.println("n");
    9: } }

    Does not compile (the numbers make the difference)!
    1: public class LineNumbers {
    2: public void getLetter(ArrayList list) {
    3: if (list.isEmpty()) { System.out.println("e");
    4: } else { System.out.println("n");
    5: } } }

     */
}
