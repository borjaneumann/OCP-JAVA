package _04_ControllingFlowWithBranching;

import java.io.BufferedReader;
import java.util.Scanner;

public class _14_TheBreakStatement {
    /*
    A break statement transfers the flow of control out to the enclosing statement.
    The same holds true for a break statement that appears inside of a while, do/while,
    or for loop, as it will end the loop early.
    When the break statement is encountered inside a loop, the loop is immediately
    terminated and the program control resumes at the next statement following the loop.
    A break statement in a loop causes it to immediately exit the entire loop structure.
    It follows a condition which could be an if-statement.

    Syntax:

    optionalLabel: while(booleanExpression) {
        // Body
        //Somewhere in loop
        break optionalLabel; //semicolon required
     }

     The break statement can take an optional label parameter. Without a label parameter,
     The break statement will terminate the nearest inner loop it is currently in the process of executing.
     The optional label parameter allows us to break out of a higher-level outer loop.
     */
    public static void main(String[] args) {
        int[][] list = {{1, 5}, {5, 2}, {2, 5}};
        int searchValue = 5;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
//                     break; // Value 2 found at: (2,0) Break escapes the loop before it is executed and
                            // in this case the outer loops keeps executing till it finds another match!!
//                     break PARENT_LOOP; //Value 2 found at: (1,1) it breaks to the label parent loop.
                    // If we remove the break goes to the last matching value // Value 2 found at: (2,1) As there are
                    //no breaks the program runs till the last matching value is found.
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: "
                    +
                    "(" + positionX + "," + positionY + ")");
        }

        //Break example
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter number 1: ");
            int number1 = keyboard.nextInt();
            System.out.println("Enter number 2: ");
            int number2 = keyboard.nextInt();

            if (number2 == 0) {
                break;
            }

            System.out.println(number1 + "/" + number2 + " is " + (number1 / number2));
        } while (true);
        System.out.println("Number 2 was equal to 0");

        hello: for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println("i:" + i + " : " + "j:" + j);
                if (i==1 && j == 4) {
                    break hello;
                }
            }
        }
    }
}
