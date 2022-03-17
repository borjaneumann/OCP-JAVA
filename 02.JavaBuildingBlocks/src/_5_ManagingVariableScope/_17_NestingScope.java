package _5_ManagingVariableScope;

public class _17_NestingScope {
    /*
    Remember that blocks can contain other blocks. These smaller contained
    blocks can reference variables defined in the larger scoped blocks, but not
    vice versa. Here’s an example:
    */
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        //System.out.println(teenyBit); // DOES NOT COMPILE
    }




}
