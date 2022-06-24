package _6_WorkingWithGenerics._2_GenericClasses.Example2;

//public class Printer <T extends Animal>{
public class Printer <T extends Animal>{ //if we extend to Animals now we are
    //restraining the type to whatever extends animal.
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print() {
        thingToPrint.eat();//Because now T extends Animal, we can inherit its methods.
        System.out.println(thingToPrint);
    }
}
