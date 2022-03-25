package _02_CreatingClasses.ThisReference.uses;

public class RealUsageOfThisConstructorCall {
    int rollNo;
    String name, course;
    float fee;

    RealUsageOfThisConstructorCall(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    RealUsageOfThisConstructorCall(int rollNo, String name, String course, float fee){
        this(rollNo,name,course); ////Rule: Call to this() must be the first statement in constructor.
        this.fee = fee;
    }
    void display(){
        System.out.println(rollNo + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        RealUsageOfThisConstructorCall student1 = new RealUsageOfThisConstructorCall(111,"Joseph", "Java");
        RealUsageOfThisConstructorCall student2 = new RealUsageOfThisConstructorCall(112,"Peter", "Java", 6000f);
        student1.display();
        student2.display();
    }
}
