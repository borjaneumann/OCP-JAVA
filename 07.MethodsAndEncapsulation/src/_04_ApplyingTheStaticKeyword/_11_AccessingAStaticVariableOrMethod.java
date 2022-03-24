package _04_ApplyingTheStaticKeyword;

public class _11_AccessingAStaticVariableOrMethod {
    /*
    You just put the class name before the method or variable and you are done.

    System.out.println(Koala.count);
    Koala.main(new String[0]);

   There is one rule that is trickier. You can use an instance of the object to call a static method.
   The compiler checks for the type of the reference and uses that instead of the object—which is
    sneaky of Java. This code is perfectly legal:

    Koala k = new Koala();
    System.out.println(k.count); // k is a Koala
    k = null; The exam creators will try to trick you into thinking a NullPointerException is thrown because the
                variable happens to be null. Don’t be fooled!
    System.out.println(k.count); // k is still a Koala

    what does the following output?
    Koala.count = 4;
    Koala koala1 = new Koala();
    Koala koala2 = new Koala();
    koala1.count = 6;
    koala2.count = 5;
    System.out.println(Koala.count); //5

     */

}
