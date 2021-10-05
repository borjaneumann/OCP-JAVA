package ThisReference.uses;

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
        this(rollNo,name,course); //
        this.fee = fee;
    }
}
