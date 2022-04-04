package _02_RecognizingExceptionClasses._01_RuntimeExceptionClasses;

public class _08_IllegalArgumentException extends Throwable {
    //it's a way for your program to protect itself
    //Thrown by the programmer to indicate that a
    //method has been passed an illegal or inappropriate argument

    private int numberEggs2;
    public void setNumberEggs(int numberEggs) throws _08_IllegalArgumentException {
        if (numberEggs < 0){
            throw new IllegalArgumentException();}
        else
        this.numberEggs2=numberEggs;

    }

    public static void main(String[] args) throws _08_IllegalArgumentException {
        _08_IllegalArgumentException iae1 = new _08_IllegalArgumentException();
        _08_IllegalArgumentException iae2 = new _08_IllegalArgumentException();

        iae1.setNumberEggs(3);
        System.out.println(iae1.numberEggs2);
        iae2.setNumberEggs(-2);
        System.out.println(iae2.numberEggs2);

    }
}
