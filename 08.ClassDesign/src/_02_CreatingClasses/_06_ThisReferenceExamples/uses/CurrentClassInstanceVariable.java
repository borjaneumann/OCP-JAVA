package _02_CreatingClasses.ThisReference.uses;

public class CurrentClassInstanceVariable {
    String name;
    String surname;

    public CurrentClassInstanceVariable(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    void display(){
        System.out.println(name + " " + surname);
    }

    public static void main(String[] args) {
        CurrentClassInstanceVariable c = new CurrentClassInstanceVariable("John", "Smith");
        c.display();
    }
}
