package _6_MakeDecisionsWithTheTernaryOperators;

public class _18_TernaryOperator {
    /*
     The conditional operator, ? :, otherwise known as the ternary operator.

     booleanExpression ? expression1 : expression2

     The first operand must be a boolean expression, and the second and third
    operands can be any expression that returns a value.

    int owl = 5;
    int food;
    if(owl < 2) {
        food = 3;
    } else {
        food = 4;
    }
    System.out.println(food); // 4

    int owl = 5;
    int food = owl < 2 ? 3 : 4;
    System.out.println(food); // 4

    There is no requirement that second
    and third expressions in ternary operations have the same data types,
    although it does come into play when combined with the assignment
    operator.

    int stripes = 7;
    System.out.print((stripes > 5) ? 21 : "Zebra");
    int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

    Both expressions evaluate similar boolean values and return an int and a
    String, although only the first one will compile. System.out.print()
    does not care that the expressions are completely different types, because
    it can convert both to Object values and call toString() on them.

    On the other hand, the compiler does know that "Horse" is of the wrong data type
    and cannot be assigned to an int; therefore, it will not allow the code to be
    compiled.
     */
    public static void main(String[] args) {
        int sheep1 = 1;
        int zzz1 = 1;
        int sleep = zzz1<10 ? sheep1++ : zzz1++;
        System.out.print(sheep1+","+zzz1); // 2,1

        int sheep = 1;
        int zzz = 1 ;
        int sleep1 = sheep>=10? sheep++: zzz++;
        System.out.println(sheep + " ," + zzz); //1,2
    }
    /*
    For the exam, be wary of any question that includes a ternary
    expression in which a variable is modified in one of the right-hand
    side expressions.
     */
}
