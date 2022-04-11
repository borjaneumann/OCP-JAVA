package _02_WorkingWithEnums;

public class _07_PrintTheOne {
        public static void main(String[] args) {
            System.out.println("begin, ");
            _07_OnlyOne firstCall = _07_OnlyOne.ONCE; //prints constructing
            _07_OnlyOne secondCall = _07_OnlyOne.ONCE; //doesn't print anything
            System.out.println("end");
        }

}
