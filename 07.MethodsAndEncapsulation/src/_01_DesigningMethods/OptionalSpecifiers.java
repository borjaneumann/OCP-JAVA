package designingMethods;

public abstract class OptionalSpecifiers {
    //Static
    public static void staticExample(){
        return;
    }
    //abstract
    public abstract void animalSound(); //the clas should be abstract as well
    //final
    public final void walk1(){};
    //synchronized
    synchronized void printTable(int n) {//synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    //native
    private native String getLine(String prompt);
    //strictfp
    strictfp void m(){}//strictfp applied on method

}
