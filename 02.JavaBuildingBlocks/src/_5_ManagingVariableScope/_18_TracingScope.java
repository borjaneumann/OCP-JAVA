package _5_ManagingVariableScope;

public class _18_TracingScope {
    /*
    The exam will attempt to trick you with various questions on scope.
    1) Identify the blocks of code. 3 sets.
    2) hungry and amountOfFood are method parameters, so they are
        available for the entire method.
    3) The variable roomInBelly goes into scope on line 12 because that is where
        it is declared. It stays in scope for the rest of the method and so goes out of
        scope on line 22.
    4) The variable timeToEat goes into scope on line 14 where
        it is declared. It goes out of scope on line 20 where the if block ends.
    5) Finally, the variable amountEaten goes into scope on line 16 where it is
        declared. It goes out of scope on line 19 where the while block ends.

        11: public void eatMore(boolean hungry, int amountOfFood) {
        12:     int roomInBelly = 5;
        13:     if (hungry) {
        14:         var timeToEat = true;
        15:         while (amountOfFood > 0) {
        16:             int amountEaten = 2;
        17:             roomInBelly = roomInBelly - amountEaten;
        18:             amountOfFood = amountOfFood - amountEaten;
        19:         }
        20:     }
        21:     System.out.println(amountOfFood);
        22: }

     */
}
