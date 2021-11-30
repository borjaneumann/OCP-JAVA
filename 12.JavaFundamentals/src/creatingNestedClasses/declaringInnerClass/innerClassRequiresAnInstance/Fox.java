package creatingNestedClasses.declaringInnerClass.innerClassRequiresAnInstance;

public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
//        new Den(); //Cannot be referenced from an static context
    }

}
class Squirrel {
    public void visitFox(){
//        new Fox.Den(); //Does not compile. if it were inside class Fox it would compilen and Den class is private.
        Fox fox = new Fox();

    }
}