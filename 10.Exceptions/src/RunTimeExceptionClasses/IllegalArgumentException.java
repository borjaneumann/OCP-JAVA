package RunTimeExceptionClasses;

public class IllegalArgumentException extends Throwable {
    //it's a way for your program to protect itself

    private int numberEggs2;
    public void setNumberEggs(int numberEggs) throws IllegalArgumentException {
        if (numberEggs < 0){
            throw new IllegalArgumentException();}
        else
        this.numberEggs2=numberEggs;

    }

    public static void main(String[] args) throws IllegalArgumentException {
        IllegalArgumentException iae1 = new IllegalArgumentException();
        IllegalArgumentException iae2 = new IllegalArgumentException();

        iae1.setNumberEggs(3);
        System.out.println(iae1.numberEggs2);
        iae2.setNumberEggs(-2);
        System.out.println(iae2.numberEggs2);

    }
}
